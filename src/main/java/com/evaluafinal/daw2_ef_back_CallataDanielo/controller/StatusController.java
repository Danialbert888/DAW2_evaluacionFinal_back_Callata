package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Status;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.StatusService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/statu")
public class StatusController {
	
	@Autowired
	private StatusService service;
	
	@GetMapping("/status")
	public List<Status> listar(){
		return service.list();
	}

}
