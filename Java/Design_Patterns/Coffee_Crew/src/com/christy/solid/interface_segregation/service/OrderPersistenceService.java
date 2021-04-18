package com.christy.solid.interface_segregation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.christy.solid.interface_segregation.entity.Order;

public class OrderPersistenceService implements PersistenceService<Order> {
	
	private static final Map<Long, Order> ORDERS = new HashMap();

	@Override
	public void save(Order entity) {
		synchronized(ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized(ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized(ORDERS) {
			return ORDERS.get(id);
		}
	}

}
