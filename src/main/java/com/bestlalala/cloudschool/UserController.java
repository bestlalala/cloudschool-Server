package com.bestlalala.cloudschool;

import com.bestlalala.cloudschool.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /* User 테이블 전체 조회 API */
    @CrossOrigin(origins = "http://localhost:3000")  // React 앱 주소로 CORS 허용
    @GetMapping("/api/user")
    public ResponseEntity<List<UserDto>> getUserInfo() {
        List<UserDto> allUsers = userService.findAllUsers();
        return ResponseEntity.ok(allUsers);
    }
}