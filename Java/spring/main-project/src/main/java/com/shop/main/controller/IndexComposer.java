package com.shop.main.controller;

import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.zkoss.zhtml.H1;
import org.zkoss.zhtml.H3;
import org.zkoss.zhtml.P;
import org.zkoss.zhtml.Text;
import org.zkoss.zk.ui.HtmlNativeComponent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.A;
import org.zkoss.zul.Div;
import org.zkoss.zul.Hlayout;




public class IndexComposer extends SelectorComposer<Div>{
	private static final long serialVersionUID = 5984584883220302528L;
	
	@Wire
	private Div headerContent; 
	
	@Override
	public void doAfterCompose(Div comp) throws Exception {
		super.doAfterCompose(comp);
		/*Messagebox.show("Testing Composer");*/
		populateCategories();
		populateCategories();
		populateCategories();
		populateCategories();
	}
	
	public void populateCategories() {
		A a = new A();
		
		a.setParent(headerContent);
			/*<a href="ui_do_layout.zul">
			<div sclass="col-sm-4">
				<div sclass="card z-depth-1">
					<div
						sclass="card-body card-padding bgm-green">
						<h:h3
							class="c-white text-center">
							<h:i
								class="zmdi zmdi-desktop-windows p-r-10 zmdi-hc-lg">
							</h:i>
							Man Collection 
						</h:h3>
					</div>
				</div>
			</div>
		</a>*/
		a.setHref("ui_do_layout.zul");
		Div div1=new Div();
		div1.setParent(a);
		div1.setSclass("col-sm-4");
		
		Div div2 = new Div();
		div2.setParent(div1);
		div2.setSclass("card z-depth-1");
		
		Div div3 = new Div();
		div3.setParent(div2);
		div3.setSclass("card-body card-padding bgm-green");
		
		H3 h3 = new H3();
		h3.setParent(div3);
		h3.setSclass("c-white text-center");
		
		P p = new P();
		p.setParent(h3);
		new Text("Boy Collection").setParent(h3);
		p.setSclass("zmdi zmdi-desktop-windows p-r-10 zmdi-hc-lg");
		
		
		
		
	}
}
