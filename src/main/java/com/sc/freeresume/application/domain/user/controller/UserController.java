package com.sc.freeresume.application.domain.user.controller;

import com.sc.freeresume.application.domain.user.dto.UserDTO;
import com.sc.freeresume.application.domain.user.mapper.UserMapper;
import com.sc.freeresume.business.domain.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping
    @ResponseBody
    public List<UserDTO> getUsers() {
        return userService.getAll()
                .stream()
                .map(userMapper::userModeltoUserDTO)
                .toList();
    }


}
