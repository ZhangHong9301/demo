package com.zxf.springbootswagger.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Create by Mr.ZXF
 * on 2018-12-18 11:36
 */
@Data
public class Greeting {
    @ApiModelProperty(notes = "Provided user name", required =true)
    private String player;

    @ApiModelProperty(notes = "The system generated greeting message" , readOnly =true)
    private String message;

    public Greeting(String player, String message) {
        this.player = player;
        this.message = message;
    }
}
