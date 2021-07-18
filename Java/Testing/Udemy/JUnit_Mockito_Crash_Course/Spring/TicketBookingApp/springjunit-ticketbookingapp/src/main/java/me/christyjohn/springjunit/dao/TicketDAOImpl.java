package me.christyjohn.springjunit.dao;

import org.springframework.stereotype.Component;

import me.christyjohn.springjunit.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	@Override
	public int createTicket(Ticket ticket) {
		return 1;
	}

}
