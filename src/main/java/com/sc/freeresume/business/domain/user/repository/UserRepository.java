package com.sc.freeresume.business.domain.user.repository;

import com.sc.freeresume.business.domain.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUsername(String username);
}
