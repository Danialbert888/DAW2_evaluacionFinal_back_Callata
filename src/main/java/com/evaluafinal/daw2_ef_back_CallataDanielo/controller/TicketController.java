package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Ticket;
import com.evaluafinal.daw2_ef_back_CallataDanielo.models.User;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.TicketService;

@CrossOrigin( value = "http://localhost:4200")
@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketService service;

	@GetMapping("/tickets")
	public List<Ticket> listar(){
		return service.list();
	}
	
	@GetMapping("/tickets/{id}")
	public ResponseEntity<Ticket> obtenerTicketxid(@PathVariable("id") int id){
		Ticket ticket=service.buscarxid(id);
		return ResponseEntity.ok(ticket);
	}
	
	@PostMapping("/tickets")
	public Ticket guardar(@RequestBody Ticket ticket) {
		return service.add(ticket);
	}
	
	@PutMapping("/tickets/{id}")
	public ResponseEntity<Ticket> actualizarticket(@PathVariable("id") int id,@RequestBody Ticket ticketrecibido){
		Ticket ticket=service.buscarxid(id);
		ticket.setCreateAtDate(ticketrecibido.getCreateAtDate());
		ticket.setDescriptionString(ticketrecibido.getDescriptionString());
		ticket.setTitleString(ticketrecibido.getTitleString());
		ticket.setUpdatedAtDate(ticketrecibido.getUpdatedAtDate());
		ticket.setCategory(ticketrecibido.getCategory());
		ticket.setKind(ticketrecibido.getKind());
		ticket.setPriority(ticketrecibido.getPriority());
		ticket.setProject(ticketrecibido.getProject());
		ticket.setStatus(ticketrecibido.getStatus());
		ticket.setUser(ticketrecibido.getUser());
		
		service.add(ticket);
		return ResponseEntity.ok(ticket);
	}
	
	
	
	@DeleteMapping("/tickets/{id}")
	public ResponseEntity<Map<String, Boolean>> eliminarticket(@PathVariable("id") int id){
		Ticket ticket =service.buscarxid(id);
		service.delete(ticket.getIdTicket());
		Map<String, Boolean> respuesta=new HashMap<>();
		respuesta.put("eliminado", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
	
	
	
}
