package me.christyjohn.springjunit.service;

import me.christyjohn.springjunit.dao.TicketDAO;
import me.christyjohn.springjunit.dto.Ticket;

public class TicketServiceImpl implements TicketService {

	private TicketDAO dao;
	
	@Override
	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		
		return getDao().createTicket(ticket);
	}

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

}
