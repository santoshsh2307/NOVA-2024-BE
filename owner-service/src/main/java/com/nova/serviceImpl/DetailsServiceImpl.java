package com.nova.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nova.Repository.DetailsRepo;
import com.nova.entity.Details;
import com.nova.service.DetailService;

@Service
public class DetailsServiceImpl implements DetailService {

	@Autowired
	DetailsRepo detailRepo;
	
	@Override
	public Details createDetails(Details details) {
		// TODO Auto-generated method stub
		return detailRepo.save(details);
	}

	@Override
	public List<Details> getAllDetails() {
		// TODO Auto-generated method stub
		return detailRepo.findAll();
	}

}
