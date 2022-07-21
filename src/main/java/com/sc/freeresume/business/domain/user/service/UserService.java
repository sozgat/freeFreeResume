package com.sc.freeresume.business.domain.user.service;

import com.sc.freeresume.business.domain.user.model.UserModel;

import java.util.List;

public interface UserService {
    UserModel getUserByUsername(String username);
    List<UserModel> getAll();
}
