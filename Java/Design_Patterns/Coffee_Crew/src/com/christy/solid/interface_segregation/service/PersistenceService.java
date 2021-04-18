package com.christy.solid.interface_segregation.service;

import java.util.List;

import com.christy.solid.interface_segregation.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
}
