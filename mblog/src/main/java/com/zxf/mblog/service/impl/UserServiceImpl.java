package com.zxf.mblog.service.impl;

import com.zxf.mblog.mapper.UserMapper;
import com.zxf.mblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public List<Map<String, Object>> getUserList() {

        List<Map<String, Object>> mapList = userMapper.selectUserList();
        return mapList;
    }
}
