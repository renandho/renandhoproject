package com.shop.core.dao;

import java.io.Serializable;
import java.util.List;

import com.shop.core.domain.DomainObject;

public interface GenericDao<ID extends Serializable, T extends DomainObject> {
	
	List<T> findAll();
	
	List<T> findByExample(T entity);
	
	List<T> findByExample(T entity, int offset, int limit);
	
	T findById(ID id);
	
	int countByExample(T entity);

	void insert(T entity);

	void update(T entity);

	void delete(T entity);
}
