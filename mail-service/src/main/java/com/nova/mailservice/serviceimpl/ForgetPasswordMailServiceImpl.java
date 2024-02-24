package com.nova.mailservice.serviceimpl;

import com.nova.mailservice.MailEnums;
import com.nova.mailservice.service.ForgetPasswordMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ForgetPasswordMailServiceImpl implements ForgetPasswordMailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendOtp(String tomail, String otp) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(tomail);
        simpleMailMessage.setSubject(MailEnums.RESET_PASSWORD_SUBJECT+ otp);
        simpleMailMessage.setText(MailEnums.PASSWORD_RESET_MESSAGE.getMessage());
        mailSender.send(simpleMailMessage);
    }
}
