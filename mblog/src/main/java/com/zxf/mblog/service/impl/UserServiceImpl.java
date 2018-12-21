package com.zxf.mblog.service.impl;

import com.zxf.mblog.common.ResponseData;
import com.zxf.mblog.entity.User;
import com.zxf.mblog.mapper.UserMapper;
import com.zxf.mblog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 用户列表
     * @return
     */
    @Override
    public List<Map<String, Object>> getUserList() {

        List<Map<String, Object>> mapList = userMapper.selectUserList();
        return mapList;
    }

    /**
     * 用于用户登录
     * AccountProfile是有用户基本信息的类，包括私信、通知数量，头像等
     * @param email
     * @param password
     * @return
     */
    @Override
    public String  login(String email, String password) {
        return null;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public ResponseData register(User user) {
        return null;
    }
}
