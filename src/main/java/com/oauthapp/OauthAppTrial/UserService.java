package com.oauthapp.OauthAppTrial;

import org.springframework.stereotype.Repository;

import java.util.Collection;


public interface UserService {
    Collection<model> getUserInfo();
}