package com.sc.freeresume.business.domain.user.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Table(name = "user_account")
public class UserModel {

    @Column(name = "username", length = 20, unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "token_expiry_date")
    private LocalDateTime tokenExpiryDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private long id = 0L;

    @Column(name = "version")
    @Version()
    private long version = 0L;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "active", nullable = false)
    private boolean active = true;

    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date", updatable = false)
    private LocalDateTime updatedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id && version == userModel.version && active == userModel.active && Objects.equals(createdDate, userModel.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, active, createdDate);
    }
}
