package com.buguniao.spring.controller;

import com.buguniao.spring.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwenchang
 * @date 2018/6/13 11:21
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/")
    @ApiOperation("测试")
    public void test(){

        System.out.println(1);
    }
}
