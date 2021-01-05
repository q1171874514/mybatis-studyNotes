package com.example.simplemybatis.modules.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    //id
    private Long id;
    //名称
    private String name;
    //年龄
    private Integer age;
    //创建时间
    private Date creationTime;
}
