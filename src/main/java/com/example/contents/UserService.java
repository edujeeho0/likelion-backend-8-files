package com.example.contents;

import com.example.contents.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    // CREATE USER
    // 회원가입
    public UserDto create(UserDto dto) {
        // TODO
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    // READ USER BY USERNAME
    // 회원 정보 조회
    public UserDto readUserByUsername(String username) {
        // TODO
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    // UPDATE USER AVATAR
    // 회원 프로필 아이콘 업데이트
    public UserDto updateUserAvatar(Long id, MultipartFile image) {
        // TODO
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
