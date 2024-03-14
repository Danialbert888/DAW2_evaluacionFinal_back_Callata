package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Project;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.ProjectService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@GetMapping("/projects")
	public List<Project> listar(){
		return service.list();
	}

}
