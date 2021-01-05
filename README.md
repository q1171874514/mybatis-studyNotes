# mybatis-studyNotes
SpringBoot+mybitis学习笔记

## 1.master 创建项目和初始配置
#### 1.1. application.yml增加数据库配置：
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/practice?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT
        username: root
        password: root
        driver-class-name: com.mysql.jdbc.Driver
## 2.完成基本的CRUD
#### 2.1. application.yml配置entity、xml、mybatis-config.xml地址
      #mybatis配置
      mybatis:
        typeAliasesPackage: com.example.simplemybatis.modules.entity
        mapperLocations: classpath:mapper/**/*.xml
        configLocation: classpath:/mybatis-config.xml
#### 2.2. 完成entity、dao、dto、service、controller、xml代码
