package com.bestlalala.cloudschool;

import com.bestlalala.cloudschool.domain.User;
import com.bestlalala.cloudschool.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    /* 회원 조회 */
    public List<UserDto> findAllUsers() {
        return userRepository.findAll();
    }
}
