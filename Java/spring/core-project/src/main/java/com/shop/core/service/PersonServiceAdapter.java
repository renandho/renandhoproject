package com.shop.core.service;

import java.util.List;

import com.shop.core.ui.lookup.KeyValue;

public interface PersonServiceAdapter {

	public List<KeyValue> getPersonByCompany(String employeeNumber, String employeeName, Long companyId, int limit, int offset);
	public int countPersonByCompany(String employeeNumber, String employeeName, Long companyId);
}
