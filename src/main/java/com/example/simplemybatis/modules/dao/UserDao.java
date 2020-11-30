package com.example.simplemybatis.modules.dao;



import com.example.simplemybatis.modules.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> list(Map<String, Object> params);

    Boolean insert(UserEntity userEntity);

    Boolean update(UserEntity userEntity);

    Boolean delete(Long[] ids);

}

