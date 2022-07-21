package com.sc.freeresume.application.domain.user.mapper;

import com.sc.freeresume.application.domain.user.dto.UserDTO;
import com.sc.freeresume.business.domain.user.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO UserModeltoUserDTO(UserModel userModel);
}
