package com.nova.commonservice.controller;

import com.nova.commonservice.dto.LoginUserDto;
import com.nova.commonservice.service.LoginService;
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
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/loginByUserNameAndPassword")
    public ResponseEntity<Object> loginUser(String userName, String password){
        LoginUserDto userDetails = loginService.loginUser(userName, password);
        Map<String, Object> map = new HashMap<>();
        if (userDetails != null){
            map.put("code", 200);
            map.put("message", "Success");
            map.put("content", userDetails);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } else {
            map.put("code", 200);
            map.put("message", "Invalid UserName Password");
            map.put("content", "Invalid UserName Password");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }


}
