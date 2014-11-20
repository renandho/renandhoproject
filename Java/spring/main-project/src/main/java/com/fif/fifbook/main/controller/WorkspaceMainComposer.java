package com.fif.fifbook.main.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.SerializableEventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Caption;
import org.zkoss.zul.DefaultTreeModel;
import org.zkoss.zul.DefaultTreeNode;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabpanels;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Tree;
import org.zkoss.zul.Treeitem;
import org.zkoss.zul.TreeitemRenderer;
import org.zkoss.zul.Window;

import com.fif.hcms.core.constant.FunctionAccessType;
import com.fif.hcms.core.constant.LoginStatus;
import com.fif.hcms.core.constant.MenuItemType;
import com.fif.hcms.core.security.FunctionPermission;
import com.fif.hcms.core.security.Security;
import com.fif.hcms.core.security.SecurityProfile;
import com.fif.hcms.core.security.SimpleUserDetail;
import com.fif.hcms.core.service.SecurityService;
import com.fif.hcms.core.ui.AuthorizedMenuDTO;
import com.fif.hcms.core.ui.NavigationTransactionForm;
import com.fif.hcms.core.ui.TreeInfo;
import com.fif.hcms.core.ui.lookup.KeyValue;
import com.fif.hcms.core.util.DateUtil;


@VariableResolver(DelegatingVariableResolver.class)
public class WorkspaceMainComposer extends SelectorComposer<Window>
	implements TreeitemRenderer<DefaultTreeNode<TreeInfo>>, NavigationTransactionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@WireVariable(rewireOnActivate = true)
	private transient SecurityService securityServiceImpl;
	
	private static Logger log = LoggerFactory.getLogger(WorkspaceMainComposer.class);
	
	private WorkspaceMainComposer thisComposer = this;
	
	private SimpleUserDetail userDetail;
	
	private Long activeFunctionId;
	
	@Wire
	private Listbox cbCompany;
	
	@Wire
	private Listbox respListBox;
	
	@Wire
	private Tree tree;
	
	@Wire
	private Tabpanels tabPanels;
	
	@Wire
	private Tabs tabs;
	
	@Wire
	private Tab tbMenu;
	
	@Wire
	private Tab tbResp;
	
	@Wire
	private Label lblUsername;
	
	@Wire
	private Caption lblCaption;
	
	@Wire
	private Label lblLastLogin;
	
	@Wire 
	private Tabbox tabBox;
	
	@Wire
	private Label lblScope;
	
	private int prevSelectedCompany;
	
	private SecurityProfile securityProfile;
	
	private UsernamePasswordAuthenticationToken auth =  (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
	
	
	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		if (!SLF4JBridgeHandler.isInstalled())
			SLF4JBridgeHandler.install();
		//userAccessRecordProxyService = (UserAccessRecordService) SpringUtil.getBean("userAccessRecordProxyService");
		Labels.reset();
		userDetail = (SimpleUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	
		Date lastLoggedIn = new Date();
		lblLastLogin.setValue("Last login : "+DateUtil.format(lastLoggedIn, "dd-MMM-yyyy kk:mm:ss"));
		lblUsername.setValue(userDetail.getUsername());

		log.debug("User Login :"+userDetail.getUsername());
		
		if(userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){
			lblScope.setValue("Business Group : ");
		}else
			lblScope.setValue("Company : ");
	}

	
	
	@Listen("onCreate=#cbCompany")
	public void loadCompanyList(){
		userDetail = (SimpleUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
			List<KeyValue> autorizedCompanies = userDetail.getAuthorizedCompanies();
			ListModelList<KeyValue> model = new ListModelList<KeyValue>(autorizedCompanies);
			cbCompany.setModel(model);
			cbCompany.renderAll();
			cbCompany.setSelectedIndex(0);
			prevSelectedCompany = cbCompany.getSelectedIndex();
		
		if(!userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){	
			getSecurityProfile();
			buildDashboard();
		}else{
			securityProfile = new SecurityProfile();
			securityProfile.setUserName(userDetail.getUsername());
			securityProfile.setUserId(securityServiceImpl.getUserIdByUsername(userDetail.getUsername()));
			securityProfile.setWorkspaceBusinessGroupId((Long) cbCompany.getSelectedItem().getValue());
			auth.setDetails(securityProfile);
			SecurityContextHolder.getContext().setAuthentication(auth);
		}
		
		if (securityProfile != null) {
			String userInfo = String.format("%s - %s", 
					securityProfile.getEmployeeNumber() == null ? securityProfile.getUserName() : securityProfile.getEmployeeNumber(), 
					securityProfile.getFullName() == null ? "" : securityProfile.getFullName());
			lblUsername.setValue(userInfo);
		}		
	}
	
	@Listen("onSelect=#cbCompany")
	public void changeCompany(){
		Messagebox.show("Are you sure want to change the company workspace? \n It will close all of opened tabs and change the permissions related with company security", "Warning", Messagebox.YES | Messagebox.NO, Messagebox.QUESTION, new SerializableEventListener<Event>() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void onEvent(Event event) throws Exception {	
				int status = (int) event.getData();
				if(status == Messagebox.YES) {
						if(userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){
							securityProfile.setWorkspaceBusinessGroupId((Long) cbCompany.getSelectedItem().getValue());
							auth.setDetails(securityProfile);
							SecurityContextHolder.getContext().setAuthentication(auth);
							tabs.getChildren().clear();
							tabPanels.getChildren().clear();
						}else{
							getSecurityProfile();
							refreshWorkspace();	
							loadResponsibilities();
							tbResp.setSelected(true);
						}
					prevSelectedCompany = cbCompany.getSelectedIndex();
				} else {
					cbCompany.setSelectedIndex(prevSelectedCompany);
					return;
				}
			}
		});
		
	}
	
	private void refreshWorkspace(){
		tabs.getChildren().clear();
		tabPanels.getChildren().clear();
		tree.getChildren().clear();
		buildDashboard();
	}
	
	@Listen("onCreate=#respListBox")
	public void loadResponsibilities(){
		log.debug("Loading reposnibilities..");
		userDetail = (SimpleUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(!userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){
			List<KeyValue> responsibilities = securityServiceImpl.getResponsibilityByCompany(userDetail.getUsername(), (Long) cbCompany.getSelectedItem().getValue(), userDetail.getLoginStatus());
			ListModelList<KeyValue> model = new ListModelList<KeyValue>(responsibilities);
			respListBox.setModel(model);
		}else{
			List<KeyValue> responsibilities = securityServiceImpl.getSuperUserResponsibility();
			ListModelList<KeyValue> model = new ListModelList<KeyValue>(responsibilities);
			respListBox.setModel(model);
		}
		
	}
	
	@Listen("onSelect=#respListBox")
	public void selectResponsibility(){
		String respLabel = respListBox.getSelectedItem().getLabel();
		Long respId = respListBox.getSelectedItem().getValue();
		log.info("Accessing Responsibility "+respLabel+"("+respId+")");
		if(userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){
			getResponsibilityDetail(respLabel, respId);
			loadMenu(securityProfile.getSecurity().getMenuId());
			tbMenu.setSelected(true);
			lblCaption.setLabel(respLabel+" Menus");
		}else{
			getResponsibilityDetail(respLabel, respId);
			loadMenu(securityProfile.getSecurity().getMenuId());
			tbMenu.setSelected(true);
			lblCaption.setLabel(respLabel+" Menus");
			refreshWorkspace();
		}
		
	}
	
	private void getSecurityProfile(){
		log.debug("Getting security profile");
		securityProfile = securityServiceImpl.getSecurityProfile(userDetail.getUsername(), (Long)cbCompany.getSelectedItem().getValue()); 
		securityProfile.setWorkspaceCompanyId((Long) cbCompany.getSelectedItem().getValue());
		securityProfile.setWorkspaceBusinessGroupId(1L);
		log.info("Security profile : "+securityProfile);
		auth.setDetails(securityProfile);
		SecurityContextHolder.getContext().setAuthentication(auth);
	}
	
	private void getResponsibilityDetail(String respLabel, Long respId){
		log.debug("Getting Responsibility detail");
		boolean isAssignment = false;
		
		if(userDetail.getLoginStatus().equals(LoginStatus.BUSINESS_GROUP_ADMIN)){
			Security security = securityServiceImpl.getSecurityByResponsibilityId(respId);
			securityProfile.setSecurity(security);
			log.debug("Security Detail "+securityProfile.getSecurity());
			auth.setDetails(securityProfile);
			SecurityContextHolder.getContext().setAuthentication(auth);
		}else{
			if(securityProfile.getCompanyId() != null && securityProfile.getCompanyId().equals((Long)cbCompany.getSelectedItem().getValue())){
				isAssignment = true;
			}
			Security security = securityServiceImpl.getSecurityByResponsibilityId(respId, (Long)cbCompany.getSelectedItem().getValue(), isAssignment);
			securityProfile.setSecurity(security);
			log.debug("Security Detail "+securityProfile.getSecurity());
			auth.setDetails(securityProfile);
			SecurityContextHolder.getContext().setAuthentication(auth);
		}
		
		
	}
	
	
	private void loadMenu(Long rootMenuId){
		DefaultTreeModel<TreeInfo> model = securityServiceImpl.getAuthorizedTreeModelMenuByRootMenuId(rootMenuId, securityProfile.getSecurity().getMenuItemExclusions(), securityProfile.getSecurity().getFunctionItemExclusions());
			
		tree.setModel(model);
        tree.setItemRenderer(this);

	}
	
	
	private void showForm(Long actionId, String path, String moduleName, String userManualPath, FunctionPermission functionPermission, Map<String, Object> parameterMap){
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("workspaceMain", thisComposer);
		params.put("Tabbox",tabBox);
		
		log.info(String.format("Opening %s on Module %s", path, moduleName));
		
		if (parameterMap != null) {
			params.put("parameterMap", parameterMap);			
		}
		
		try {
			Tab tab = (Tab) tabs.getFellow("tab_"+moduleName.replaceAll("\\s+", ""));
			tab.setSelected(true);
			
		} catch (Exception e) {
			final Tab tab = new Tab(moduleName);
			tab.setId("tab_"+moduleName.replaceAll("\\s+", ""));
			tab.setClosable(true);
			tab.setParent(tabs);
			tab.setSelected(true);
			tab.addEventListener(Events.ON_CLOSE, new SerializableEventListener<Event>() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onEvent(Event event) throws Exception {
					event.stopPropagation();
					Messagebox.show("Are you sure want to close this tab ?", "Warning", Messagebox.YES | Messagebox.NO, Messagebox.QUESTION, new SerializableEventListener<Event>() {
						
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						@Override
						public void onEvent(Event event) throws Exception {	
							int status = (int) event.getData();
							if(status == Messagebox.YES)
								tab.close();
							else
								return;
						}
					});
					
				}
			});
			
		}
		
		try {
			Tabpanel tabpanel = (Tabpanel) tabPanels.getFellow("panel_"+moduleName.replaceAll("\\s+", ""));
			tabpanel.getFirstChild().detach();
			Executions.createComponents(path, tabpanel, params);
		} catch (Exception e) {
			Tabpanel tabpanel = new Tabpanel();
			tabpanel.setId("panel_"+moduleName.replaceAll("\\s+", ""));
			tabpanel.setStyle("overflow: auto");
			Executions.createComponents(path, tabpanel, params);
			tabpanel.setParent(tabPanels);
		}
		
	}
	
	
	
	private void buildDashboard(){
		log.debug("Building Dashboard");
		Tab tab = new Tab("Dashboard");
		tab.setClosable(false);
		tab.setParent(tabs);
		tab.setSelected(true);
		
		Tabpanel tabpanel = new Tabpanel();
		tabpanel.setStyle("overflow: auto");
		Executions.createComponents("~./hcms/workflow/workflow_dashboard.zul", tabpanel, null);
		tabpanel.setParent(tabPanels);
		
	}
	
	private FunctionPermission getFunctionPermissions(Long functionId){
		FunctionPermission functionPermission = null;
		if(securityProfile.getSecurity().getFunctionDefaultAccess().equals(FunctionAccessType.FULL.toString()))
			functionPermission = new FunctionPermission(true, true, true);
		else if (securityProfile.getSecurity().getFunctionDefaultAccess().equals(FunctionAccessType.READ.toString()))
			functionPermission = new FunctionPermission(false, false, false);
		else{
			functionPermission = securityServiceImpl.getFunctionPermissionByFunctionId(functionId); 
		}
		System.out.println("Function Permissions "+functionPermission);
		return functionPermission;
	}



	@Override
	public void render(Treeitem item, DefaultTreeNode<TreeInfo> data, int index)
			throws Exception {
		final TreeInfo fi = data.getData();
		if(fi.getType().equals(MenuItemType.FUNCTION.toString())){
			final AuthorizedMenuDTO authorizedMenuDTO = (AuthorizedMenuDTO) fi.getValue();
			item.setImage(Labels.getLabel("image.link.window"));
			
			item.addEventListener(Events.ON_CLICK, new SerializableEventListener<Event>() {

				private static final long serialVersionUID = -937092478271882623L;

				@Override
				public void onEvent(Event event) throws Exception {
					AuthorizedMenuDTO function = (AuthorizedMenuDTO) fi.getValue();
					FunctionPermission functionPermission = getFunctionPermissions(function.getActionId());
					showForm(function.getActionId(),authorizedMenuDTO.getActionUrl(), authorizedMenuDTO.getModuleName(), authorizedMenuDTO.getUserManual(), functionPermission, null);
					log.info(String.format("User Accessing %s in module %s", authorizedMenuDTO.getItemName(), authorizedMenuDTO.getModuleName()));
				}
			});

		}
			
        item.setLabel(fi.getPrompt());
        item.setValue(fi);
		
	}



	@Override
	public void navigateForm(String path, String moduleName, Map<String, Object> parameterMap) {
		showForm(null, path, moduleName, null, null, parameterMap);
	}

	
	
	
	
	
}
