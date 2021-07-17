package me.christyjohn.order.bo;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import me.christyjohn.order.bo.exception.BOException;
import me.christyjohn.order.dao.OrderDAO;
import me.christyjohn.order.dto.Order;

public class OrderBOImplTest {
	
	@Mock
	OrderDAO dao;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {
		
		OrderBOImpl bo = new OrderBOImpl();
		bo.setDao(dao);
		
		
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(1));
		boolean result = bo.placeOrder(order);
		
		assertTrue(result);
		verify(dao).create(order);
	}

}
