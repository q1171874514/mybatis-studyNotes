package com.example.simplemybatis.modules.service.impl;


import com.example.simplemybatis.common.utils.ConvertUtils;
import com.example.simplemybatis.modules.dao.UserDao;
import com.example.simplemybatis.modules.dto.UserDto;
import com.example.simplemybatis.modules.entity.UserEntity;
import com.example.simplemybatis.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDto> list() {
        List<UserEntity> userEntityList = userDao.list();
        List<UserDto> userDtoList = ConvertUtils.sourceToTarget(userEntityList, UserDto.class);
        return userDtoList;
    }
}

