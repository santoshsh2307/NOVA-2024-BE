package com.nova.mailservice.serviceimpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nova.entityservice.entity.UserDetails;
import com.nova.mailservice.MailEnums;
import com.nova.mailservice.service.ForgetPasswordMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ForgetPasswordMailServiceImpl implements ForgetPasswordMailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "send-otp-to-restpassword")
    public void sendOtp(String userDetailsJson) {
        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            UserDetails userDetails = objectMapper.readValue(userDetailsJson, UserDetails.class);

            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo("santoshhadapad416@gmail.com");
            simpleMailMessage.setSubject(MailEnums.RESET_PASSWORD_SUBJECT + userDetails.getOtp());
            simpleMailMessage.setText(MailEnums.PASSWORD_RESET_MESSAGE.getMessage());
            mailSender.send(simpleMailMessage);
        } catch (Exception e) {
            // Handle the exception (e.g., log the error)
            e.printStackTrace();
        }
    }
    @Override
    public void sendOtp(String tomail, String otp) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(tomail);
        simpleMailMessage.setSubject(MailEnums.RESET_PASSWORD_SUBJECT+ otp);
        simpleMailMessage.setText(MailEnums.PASSWORD_RESET_MESSAGE.getMessage());
        mailSender.send(simpleMailMessage);
    }
}
