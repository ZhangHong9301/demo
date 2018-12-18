package com.zxf.springbootswagger.controller;

import com.zxf.springbootswagger.bean.Greeting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

/**
 * Create by Mr.ZXF
 * on 2018-12-18 11:34
 */
@RestController
@RequestMapping("/api")
@Api(value = "user", description = "Rest API for user operations", tags = "User API")
public class HelloWorldController {

   /*@Api注解用于说明每个控制器类（有点像类注释）。
    @ApiOperation注解用于描述资源和方法。
    @ApiResponse注解用于说明操作返回的其他响应值。例如：200 ok或202 accepted等
    @ApiModelProperty注解用来描述POJO（Bean）类的属性（属性描述）。*/

    @GetMapping(value = "/hello/{name}", produces = "application/json")
    @ApiOperation(value = "Display greeting message to non-admin user", response = Greeting.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "The resource not found")
    }
    )
    public Greeting message(@PathVariable String name) {
        Greeting msg = new Greeting(name, "Hello " + name);
        return msg;
    }
}
