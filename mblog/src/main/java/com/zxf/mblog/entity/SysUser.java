package com.zxf.mblog.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Create by Mr.ZXF
 * on 2018-12-25 16:05
 */
@Data
public class SysUser implements UserDetails {

    private Integer id; //int(10) NOT NULL,
    private String username; //varchar(50) DEFAULT NULL,
    private String realname; //varchar(50) DEFAULT NULL,
    private String password; //varchar(50) DEFAULT NULL,
    private Date createDate; //date DEFAULT NULL,
    private Date lastLoginTime; //date DEFAULT NULL,
    private boolean enabled; //int(5) DEFAULT NULL,
    private boolean accountNonExpired; //int(5) DEFAULT NULL,
    private boolean accountNonLocked; //int(5) DEFAULT NULL,
    private boolean credentialsNonExpired; //int(5) DEFAULT NULL,

    //用户拥有的所有权限
    private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();


}
