package com.nova.commonservice.service;

import com.nova.commonservice.dto.LoginUserDto;

public interface LoginService {
    LoginUserDto loginUser(String userName, String password);
}
