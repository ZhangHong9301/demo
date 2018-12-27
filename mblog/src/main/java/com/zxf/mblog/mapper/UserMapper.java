package com.zxf.mblog.mapper;

import com.zxf.mblog.entity.Permission;
import com.zxf.mblog.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 10:16
 */
public interface UserMapper {

    List<Map<String ,Object>> selectUserList();

    /**
     * 查询当前用户对象
     */

    public SysUser findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     */
    public List<Permission> findPermissionByUsername(String username);

    /**
     * 修改密码
     */
    public void updatePassword(@Param("username") String username, @Param("password") String password);
}
