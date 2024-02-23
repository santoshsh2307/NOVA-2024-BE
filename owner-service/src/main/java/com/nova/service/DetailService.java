package com.nova.service;


import java.util.List;

import com.nova.entity.Details;

public interface DetailService {

	Details createDetails(Details details);

	List<Details> getAllDetails();

}
