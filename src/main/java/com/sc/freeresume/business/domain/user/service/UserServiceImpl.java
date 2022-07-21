package com.sc.freeresume.business.domain.user.service;

import com.sc.freeresume.business.domain.user.model.UserModel;
import com.sc.freeresume.business.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserModel> getAll() {
        return userRepository.findAll();
    }
}
