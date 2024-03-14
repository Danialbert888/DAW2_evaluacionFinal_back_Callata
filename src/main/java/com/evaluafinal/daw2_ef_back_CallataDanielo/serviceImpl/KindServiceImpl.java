package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Kind;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.KindRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.KindService;

@Service
public class KindServiceImpl implements KindService {
	
	@Autowired
	KindRepo repo;

	@Override
	public List<Kind> list() {
		
		return repo.findAll();
	}

}
