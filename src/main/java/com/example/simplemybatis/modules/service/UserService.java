package com.example.simplemybatis.modules.service;

import com.example.simplemybatis.modules.dao.UserDao;
import com.example.simplemybatis.modules.dto.UserDto;
import com.example.simplemybatis.modules.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserDto> list(Map<String, Object> params);

    Boolean save(UserDto userDto);

    Boolean update(UserDto userDto);

    Boolean delete(Long[] ids);
}
