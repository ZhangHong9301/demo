package com.zxf.mblog.entity;

import lombok.Data;

/**
 * Create by Mr.ZXF
 * on 2018-12-25 16:10
 */
@Data
public class Permission {
    private Integer id; //int(10) NOT NULL,
    private String permName; //varchar(50) DEFAULT NULL,
    private String permTag; //varchar(50) DEFAULT NULL,
}
