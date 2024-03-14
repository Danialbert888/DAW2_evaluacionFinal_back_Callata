package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Priority;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.PriorityRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {
	
	@Autowired
	PriorityRepo repo;

	@Override
	public List<Priority> list() {
		
		return repo.findAll();
	}

}
