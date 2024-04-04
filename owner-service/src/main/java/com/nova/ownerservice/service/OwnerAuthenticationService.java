package com.nova.ownerservice.service;

import com.nova.entityservice.entity.UserDetails;

public interface OwnerAuthenticationService {
    UserDetails ownerAuthenticationServiceByEmail(String userEmail);
}
