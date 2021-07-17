package me.christyjohn.order.bo;

import me.christyjohn.order.bo.exception.BOException;
import me.christyjohn.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;
	
	boolean cancelOrder(int id) throws BOException;
	
	boolean deleteOrder(int id) throws BOException;
}
