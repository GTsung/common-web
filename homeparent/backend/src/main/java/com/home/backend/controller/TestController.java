package com.home.backend.controller;

import com.home.common.exception.HomeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "test")
@RestController
public class TestController {

    @ApiOperation(value = "getStr", notes = "test for getStr")
    @GetMapping("/str")
    public String getStr() {
        return "str";
    }

    @ApiOperation(value = "exception")
    @GetMapping("/exception")
    public Object testException() {
        throw new HomeException("发生错误");
    }

}
