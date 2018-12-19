package com.zxf.mblog.controller;

import com.zxf.mblog.common.ResponseData;
import com.zxf.mblog.common.ResponseEnum;
import com.zxf.mblog.exception.BusinessException;
import com.zxf.mblog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:30
 */
@RestController
@RequestMapping("/user")
@Api(value = "user", description = "Rest API for user operations", tags = "User API")
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    UserService userService;

    @GetMapping(value = "/list", produces = "application/json")
    @ApiOperation(value = "Display greeting message to non-admin user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "The resource not found")
    }
    )
    public String getUserList() {
        List<Map<String, Object>> userList = userService.getUserList();
        logger.info("ResponseData.success(userList): " + ResponseData.success(userList));

        return ResponseData.success(userList);
    }
}