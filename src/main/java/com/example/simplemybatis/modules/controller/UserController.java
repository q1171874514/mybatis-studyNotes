package com.example.simplemybatis.modules.controller;

import com.example.simplemybatis.common.utils.Result;
import com.example.simplemybatis.modules.dao.UserDao;
import com.example.simplemybatis.modules.dto.UserDto;
import com.example.simplemybatis.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return new Result<List<UserDto>>().ok(userService.list(params));
    }

    @PostMapping
    public Result save(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return new Result().ok(true);
    }

    @PutMapping
    public Result update(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        userService.update(userDto);
        return new Result();
    }

    @DeleteMapping
    public Result delete(@RequestParam Long[] ids) {
        Arrays.stream(ids).forEach(System.out::println);
        userService.delete(ids);
        return new Result();
    }


}
