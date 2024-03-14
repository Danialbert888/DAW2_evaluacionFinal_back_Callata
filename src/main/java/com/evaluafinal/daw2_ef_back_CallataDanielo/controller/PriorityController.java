package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Priority;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.PriorityService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/priority")
public class PriorityController {

	@Autowired
	private PriorityService service;
	
	@GetMapping("/prioritys")
	public List<Priority> listar(){
		return service.list();
	}
}
