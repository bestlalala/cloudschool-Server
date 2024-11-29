package com.bestlalala.cloudschool.controller;

import com.bestlalala.cloudschool.service.UserService;
import com.bestlalala.cloudschool.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /* User 테이블 전체 조회 API */
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getUserInfo() {
        List<UserDto> allUsers = userService.findAllUsers();
        return ResponseEntity.ok(allUsers);
    }
}
