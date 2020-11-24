package com.example.simplemybatis.modules.dao;



import com.example.simplemybatis.modules.entity.UserEntity;

import java.util.List;

public interface UserDao {
    List<UserEntity> list();
}

