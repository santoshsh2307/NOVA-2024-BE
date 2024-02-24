package com.nova.commonservice.controller;

import com.nova.commonservice.service.CreateCommonUserService;
import com.nova.entityservice.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "commonservice/v1")
public class CreateCommonUserController {

    @Autowired
    private CreateCommonUserService createCommonUserService;

    @PostMapping(value = "/createUser")
    public ResponseEntity<Object> createUser(@RequestBody UserDetails userDetails){
        createCommonUserService.createUser(userDetails);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", "Success");
        map.put("content", "Success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
