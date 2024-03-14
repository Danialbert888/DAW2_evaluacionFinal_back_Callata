package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Project;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.ProjectRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired 
	ProjectRepo repo;

	@Override
	public List<Project> list() {
		
		return repo.findAll();
	}

}
