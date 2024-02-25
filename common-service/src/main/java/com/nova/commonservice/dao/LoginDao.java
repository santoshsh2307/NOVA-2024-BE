package com.nova.commonservice.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nova.commonservice.dto.LoginUserDto;

public interface LoginDao {
    LoginUserDto findByUserNameAndPassword(String userName, String password) throws JsonProcessingException;
}
