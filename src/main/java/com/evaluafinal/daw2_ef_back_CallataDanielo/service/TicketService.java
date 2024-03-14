package com.evaluafinal.daw2_ef_back_CallataDanielo.service;

import java.util.List;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Ticket;

public interface TicketService {
	
	public List<Ticket> list();
	public Ticket add(Ticket ticket);
	public Ticket update(Ticket ticket);
	public void delete(int id);
	public Ticket buscarxid(int id) ;
//	public Ticket buscarxnombre(String name);

}
