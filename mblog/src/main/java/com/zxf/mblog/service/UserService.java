package com.zxf.mblog.service;

import com.zxf.mblog.common.ResponseData;
import com.zxf.mblog.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:24
 */
public interface UserService {

    /**
     * 用户列表
     * @return
     */
    List<Map<String, Object>> getUserList();

    /**
     * 用于用户登录
     * AccountProfile是有用户基本信息的类，包括私信、通知数量，头像等
     * @param email
     * @param password
     * @return
     */
    String login(String email, String password);

    /**
     * 注册
     * @param user
     * @return
     */
    ResponseData register(User user);
}
