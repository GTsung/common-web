package com.home.backend.controller;

import com.home.backend.domain.SysUserDO;
import com.home.backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author guxc
 * @date 2020/9/6
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Object saveUser(@RequestBody SysUserDO userDO) {
        return userService.save(userDO);
    }

    @GetMapping("/list")
    public Object getUser() {
        return userService.getAll();
    }
}
