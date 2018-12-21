package com.zxf.mblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:33
 */
@Data
public class User {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 昵称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮件
     */
    private String email;

    /**
     * 手机电话
     */
    private String mobile;

    /**
     * 积分
     */
    private Integer point;

    private String sign;

    /**
     * 性别
     */
    private String gender;

    /**
     * 微信号
     */
    private String wechat;

    private String vipLevel;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 内容数量
     */
    private Integer postCount;

    /**
     * 评论数量
     */
    private Integer commentCount;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 最后的登陆时间
     */
    private Date lasted;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 最后修改时间
     */
    private Date modified;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username=" + username +
                ", password=" + password +
                ", email=" + email +
                ", mobile=" + mobile +
                ", point=" + point +
                ", sign=" + sign +
                ", gender=" + gender +
                ", wechat=" + wechat +
                ", vipLevel=" + vipLevel +
                ", birthday=" + birthday +
                ", avatar=" + avatar +
                ", postCount=" + postCount +
                ", commentCount=" + commentCount +
                ", status=" + status +
                ", lasted=" + lasted +
                ", created=" + created +
                ", modified=" + modified +
                "}";
    }
}
