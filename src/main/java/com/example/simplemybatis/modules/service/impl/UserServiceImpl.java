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
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDto> list(Map<String, Object> params) {
        List<UserEntity> userEntityList = userDao.list(params);
        List<UserDto> userDtoList = ConvertUtils.sourceToTarget(userEntityList, UserDto.class);
        return userDtoList;
    }

    @Override
    public Boolean save(UserDto userDto) {
        UserEntity userEntity = ConvertUtils.sourceToTarget(userDto, UserEntity.class);
        return userDao.insert(userEntity);
    }

    @Override
    public Boolean update(UserDto userDto) {
        UserEntity userEntity = ConvertUtils.sourceToTarget(userDto, UserEntity.class);
        return userDao.update(userEntity);
    }

    @Override
    public Boolean delete(Long[] ids) {
        return userDao.delete(ids);
    }


}

