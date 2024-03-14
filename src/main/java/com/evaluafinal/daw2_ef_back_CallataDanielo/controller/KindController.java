package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Kind;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.KindService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/kind")
public class KindController {
	
	@Autowired
	private KindService service;
	
	@GetMapping("/kinds")
	public List<Kind> listar(){
		return service.list();
	}

}
