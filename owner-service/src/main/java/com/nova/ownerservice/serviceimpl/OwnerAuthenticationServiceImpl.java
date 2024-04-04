package com.nova.ownerservice.serviceimpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nova.entityservice.entity.UserDetails;
import com.nova.entityservice.repository.UserDetailsRepository;
import com.nova.ownerservice.dto.OwnerDto;
import com.nova.ownerservice.service.OwnerAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerAuthenticationServiceImpl implements OwnerAuthenticationService {

    private static  final Logger logger = LoggerFactory.getLogger(OwnerAuthenticationServiceImpl.class);

    @Autowired
    UserDetailsRepository ownerDetailsRepository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    @Override
    public UserDetails ownerAuthenticationServiceByEmail(String userEmail) {

        try {
            logger.info("ownerAuthenticationServiceByEmail ownerAuthenticationServiceByEmail {} ", userEmail);
            Optional<UserDetails> ownerData = ownerDetailsRepository.findByEmail(userEmail);

            if (ownerData.isPresent()) {
                UserDetails userDetails = ownerData.get();
                userDetails.setOtp((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)) + "");
                ownerDetailsRepository.save(userDetails);

                // Convert to DTO before serialization
                OwnerDto userDetailsDTO = new OwnerDto();
                userDetailsDTO.setId(userDetails.getId());
                userDetailsDTO.setEmail(userDetails.getEmail());
                userDetailsDTO.setOtp(userDetails.getOtp());
                ObjectMapper objectMapper =new ObjectMapper();
                String serializedUserDetails = objectMapper.writeValueAsString(userDetailsDTO);

                kafkaTemplate.send("send-otp-to-restpassword", null, serializedUserDetails);
            } else {
                // Handle the case when ownerData is empty
            }
        } catch (Exception e) {
            logger.error("ownerAuthenticationServiceByEmail Error {}" , e.getMessage());
        }
        return null;
    }

}
