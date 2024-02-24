package com.nova.mailservice.service;

import com.nova.mailservice.MailEnums;

public interface ForgetPasswordMailService {

    void sendOtp(String tomail, String otp);
}
