package com.nova.ownerservice.controller;

import com.nova.entityservice.entity.UserDetails;
import com.nova.ownerservice.service.OwnerAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "ownerservice/v1")
public class OwnerAuthenticationController {

    @Autowired
    private OwnerAuthenticationService ownerAuthenticationService;

    @GetMapping(value = "/ownerAuthenticationServiceByEmail")
    public ResponseEntity<Object> ownerAuthenticationServiceByEmail(String userEmail){
        UserDetails ownerDetail = ownerAuthenticationService.ownerAuthenticationServiceByEmail(userEmail);
        Map<String, Object> map = new HashMap<>();

        if (ownerDetail != null){
            map.put("code", "200");
            map.put("message", "Success");
            map.put("content", ownerDetail);
           return new ResponseEntity<>(map, HttpStatus.OK);
        } else {
            map.put("code", "200");
            map.put("message", "Success");
            map.put("content", "Success");
           return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }
}
