package me.christyjohn.order.bo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
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

	private static final int ORDER_ID = 123;
	@Mock
	OrderDAO dao;
	private OrderBOImpl bo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		bo = new OrderBOImpl();
		bo.setDao(dao);
	}

	@Test
	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(1));
		when(dao.create(any(Order.class))).thenReturn(new Integer(1)); // implementing Matcher. either above or this is fine
		boolean result = bo.placeOrder(order);

		assertTrue(result);
		verify(dao).create(order);
	}

	@Test
	public void placeOrder_Should_Not_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(0));
		boolean result = bo.placeOrder(order);

		assertFalse(result);
		verify(dao).create(order);
	}
	
	@Test
	public void deleteOrder_Should_Delete_An_Order() throws SQLException, BOException {
		when(dao.delete(ORDER_ID)).thenReturn(new Integer(1));
		boolean result = bo.deleteOrder(ORDER_ID);
		
		assertTrue(result);
		verify(dao).delete(ORDER_ID);
	}
	
	@Test
	public void deleteOrder_Should_Not_Delete_An_Order() throws SQLException, BOException {
		when(dao.delete(ORDER_ID)).thenReturn(new Integer(0));
		boolean result = bo.deleteOrder(ORDER_ID);
		
		assertFalse(result);
		verify(dao).delete(ORDER_ID);
	}

	@Test(expected = BOException.class)
	public void placeOrder_Should_Throw_BOException() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenThrow(SQLException.class);
		bo.placeOrder(order);
	}
	
	@Test
	public void cancelOrder_Should_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		boolean result = bo.cancelOrder(ORDER_ID);
		
		assertTrue(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
	}
	
	@Test
	public void cancelOrder_Should_Not_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		boolean result = bo.cancelOrder(ORDER_ID);
		
		assertFalse(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
	}
	
	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_BOExceptionOnRead() throws SQLException, BOException {
		when(dao.read(ORDER_ID)).thenThrow(SQLException.class);
		boolean result = bo.cancelOrder(ORDER_ID);
	}

	@Test(expected = BOException.class)
	public void cancelOrder_Should_Not_Throw_BOExceptionOnUpdate() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		bo.cancelOrder(ORDER_ID);
	}

	@Test(expected = BOException.class)
	public void deleteOrder_Should_Throw_BOException() throws SQLException, BOException {
		when(dao.delete(ORDER_ID)).thenThrow(SQLException.class);
		bo.deleteOrder(ORDER_ID);
	}
}
