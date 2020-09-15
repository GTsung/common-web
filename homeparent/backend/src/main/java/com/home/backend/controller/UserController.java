package com.home.backend.controller;

import com.home.backend.domain.SysUserDO;
import com.home.backend.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author GTsung
 * @date 2020/9/6
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    @ApiOperation(value = "添加用户", notes = "add", tags = {"userTag"})
    public Object saveUser(@RequestBody SysUserDO userDO) {
        return userService.save(userDO);
    }

    @GetMapping("/list")
    @ApiOperation("用户列表页")
    public Object getUser() {
        log.info("userList");
        return userService.getAll();
    }
}
