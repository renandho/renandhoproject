package com.shop.main.controller;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.Div;

public class IndexComposer extends SelectorComposer<Div>{
	private static final long serialVersionUID = 5984584883220302528L;
	
	@Override
	public void doAfterCompose(Div comp) throws Exception {
		super.doAfterCompose(comp);
		/*Messagebox.show("Testing Composer");*/
	}
	
	public void populateCategories() {
		
	}
}
