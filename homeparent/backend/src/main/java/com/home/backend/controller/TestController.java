package com.home.backend.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ApiOperation(value = "getStr", notes = "test for getStr")
    @RequestMapping("/str")
    public String getStr() {
        return "str";
    }
}
