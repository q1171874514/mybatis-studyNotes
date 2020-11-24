# simple-mybatis
最简单的mybatis项目

## 1.master 创建项目和初始配置
#### 1.1. application.yml增加数据库配置：
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/practice?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT
        username: root
        password: root
        driver-class-name: com.mysql.jdbc.Driver
    
      
