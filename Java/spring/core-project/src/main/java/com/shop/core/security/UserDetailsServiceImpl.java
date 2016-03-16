package com.shop.core.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shop.core.constant.LoginStatus;
import com.shop.core.service.SecurityService;
import com.shop.core.ui.lookup.KeyValue;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	
	private SecurityService securityService;
	
	private boolean enabled = false;
	
	private LdapTemplate ldapTemplate;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LoginStatus loginStatus = null;
		//int count = securityService.countActiveUserByUsername(username);
	/*	List<KeyValue> authorizedCompanies = null;
		int count  = 1;
		if(count > 0){
			
			if(securityService.isBusinessGroupAdmin(username) > 0){
				
				authorizedCompanies = securityService.getBusinessGroup();
				enabled = true;
				loginStatus = LoginStatus.BUSINESS_GROUP_ADMIN;
			}else{
				if(securityService.isEmployee(username)){
					authorizedCompanies = securityService.getEmployeeAuthorizedCompanies(username);
					loginStatus = LoginStatus.EMPLOYEE;
				}else{
					authorizedCompanies = securityService.getNonEmployeeAuthorizedCompaniesByUserName(username);
					loginStatus = LoginStatus.NON_EMPOYEE;
				}
				if(authorizedCompanies.size() > 0 )
					enabled = true;
				else
					enabled = false;
			}
			
		} else {
			throw new UsernameNotFoundException("Username or password did not match");
		}*/
		/*DirContextAdapter dir = (DirContextAdapter) ldapTemplate.lookup("uid="+username);
		System.out.println("Password : "+dir.getObjectAttribute("userPassword"));*/
//		List<KeyValue> authorizedCompanies = 2;
		/*return new SimpleUserDetail(username, "password", enabled, true, true, true, new ArrayList<GrantedAuthority>(), authorizedCompanies, loginStatus);*/
		return new SimpleUserDetail(username, "password", enabled, true, true, true, new ArrayList<GrantedAuthority>(), loginStatus);
	}

	public LdapTemplate getLdapTemplate() {
		return ldapTemplate;
	}

	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

}
