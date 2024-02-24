package com.nova.mailservice.controller;

import com.nova.mailservice.MailEnums;
import com.nova.mailservice.service.ForgetPasswordMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping(value = "mailservice/v1")
public class ForgetPasswordMailController {

    @Autowired
    ForgetPasswordMailService forgetPasswordMailService;

    @GetMapping(value = "/senOtp")
    public void sendMail(String tomail, String otp){
        forgetPasswordMailService.sendOtp(tomail, otp);
    }
}
