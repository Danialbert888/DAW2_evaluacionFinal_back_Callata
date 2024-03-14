package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Status;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.StatusRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired
	StatusRepo repo;

	@Override
	public List<Status> list() {
		
		return repo.findAll();
	}
	

}
