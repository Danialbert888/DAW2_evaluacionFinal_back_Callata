package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Ticket;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.TicketRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepo repo;

	@Override
	public List<Ticket> list() {
		
		return repo.findAll();
	}

	@Override
	public Ticket add(Ticket ticket) {
		
		return repo.save(ticket);
	}

	@Override
	public Ticket update(Ticket ticket) {
		
		return repo.save(ticket);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
		
	}

	@Override
	public Ticket buscarxid(int id) {
		
		Ticket ticket=repo.findById(id).orElse(null);
		return ticket;
	}

	
	
}
