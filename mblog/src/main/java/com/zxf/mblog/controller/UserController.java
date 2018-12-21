package com.zxf.mblog.controller;

import com.zxf.mblog.common.ResponseData;
import com.zxf.mblog.common.ResponseEnum;
import com.zxf.mblog.exception.BusinessException;
import com.zxf.mblog.service.UserService;
import com.zxf.mblog.utils.CaptchaUtil;
import com.zxf.mblog.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:30
 */
@RestController
@RequestMapping("/user")
@Api(value = "user", description = "Rest API for user operations", tags = "User API")
@Slf4j
public class UserController {

    @Resource
    UserService userService;

    @Resource
    RedisUtil redisUtil;



    @GetMapping(value = "/list", produces = "application/json")
    @ApiOperation(value = "Display greeting message to non-admin user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "The resource not found")
    }
    )
    public String getUserList() {
        List<Map<String, Object>> userList = userService.getUserList();

        return ResponseData.success(userList);
    }

    @PostMapping("/redisTest")
    @ApiOperation(value = "Test Redis")
    public String redisTest() {
        redisUtil.set("Test", "This is a test for redis!");
        log.info("Test: " + redisUtil.get("Test"));
        return ResponseData.success();
    }

    @PostMapping("/hello")
    @ApiOperation(value = "Test Captcha")
    public String hello(HttpServletRequest request){
        if (!CaptchaUtil.checkCaptcha(request)) {
            return ResponseData.failure(ResponseEnum.DATA_IS_WRONG);
        } else {
            return ResponseData.success();
        }
    }
}
