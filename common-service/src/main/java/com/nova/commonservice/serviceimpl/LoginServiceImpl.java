package com.nova.commonservice.serviceimpl;

import com.nova.commonservice.dao.LoginDao;
import com.nova.commonservice.dto.LoginUserDto;
import com.nova.commonservice.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    LoginDao loginDao;

    @Override
    public LoginUserDto loginUser(String userName, String password) {
        try {
            logger.info("login loginUser {} ", userName ,password);
            return loginDao.findByUserNameAndPassword(userName,password);
        } catch (Exception e) {
            logger.error("Login Error {}" , e.getMessage());
        }

        return null;
    }
}
