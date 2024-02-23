package com.nova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.nova.entity.Details;
import com.nova.service.DetailService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/ownerservice")
public class DetailsController {

	@Autowired
	DetailService detailService;

	@PostMapping(value = "createDetails")
	public ResponseEntity<Object> createDetails(@RequestBody Details details) {
		try {
			Details ud = detailService.createDetails(details);
			if (ud != null) {
				return new ResponseEntity<Object>("Save Data Successfull", HttpStatus.CREATED);
			} else {
				return new ResponseEntity<Object>("not Cretaed", HttpStatus.CREATED);
			}

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Object>("Something went wrong", HttpStatus.CREATED);
		}
	}
	
	@GetMapping(value = "getAllUserDetails")
	public ResponseEntity<Object> getAllUserDetails() {
    
		List<Details> data = detailService.getAllDetails();
		if (data.isEmpty()) {
			return new ResponseEntity<Object>("no data found", HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(data, HttpStatus.OK);
		}
	}
}
