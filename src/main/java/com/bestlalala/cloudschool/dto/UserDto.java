package com.bestlalala.cloudschool.dto;

import com.bestlalala.cloudschool.domain.User;
import lombok.Data;

@Data
public class UserDto {
    private Long userId;
    private String userName;
    private String userEmail;

    public UserDto(User user) {
        userId = user.getId();
        userName = user.getName();
        userEmail = user.getEmail();
    }
}