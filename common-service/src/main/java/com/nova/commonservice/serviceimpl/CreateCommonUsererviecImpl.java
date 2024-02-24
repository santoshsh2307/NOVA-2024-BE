package com.nova.commonservice.serviceimpl;

import com.nova.commonservice.service.CreateCommonUserService;
import com.nova.entityservice.entity.UserDetails;
import com.nova.entityservice.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreateCommonUsererviecImpl implements CreateCommonUserService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public void createUser(UserDetails userDetails) {
        userDetails.setCreatedAt(LocalDate.now());
        userDetails.setStatus(true);
        userDetails.setIsDeleted(false);
        userDetails.setIsPhoneNoVerified(false);
        userDetailsRepository.save(userDetails);
    }
}
