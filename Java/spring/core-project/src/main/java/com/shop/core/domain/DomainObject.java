package com.shop.core.domain;

import java.io.Serializable;

public interface DomainObject extends Serializable {
	
	Integer getObjectVersion();
	void setObjectVersion(Integer version);

}
