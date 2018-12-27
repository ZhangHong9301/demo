package com.zxf.mblog.security;

import com.zxf.mblog.entity.Permission;
import com.zxf.mblog.entity.SysUser;
import com.zxf.mblog.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MyUserDetilsService implements UserDetailsService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = userMapper.findByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("User doesn't exit");
        }

        //根据用户名查询当前用户所有权限
        List<Permission> permList = userMapper.findPermissionByUsername(username);
        //authorities：存放所有用户权限
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Permission perm : permList) {
            GrantedAuthority authority = new SimpleGrantedAuthority(perm.getPermTag());
            authorities.add(authority);
        }
        //把所有权限赋值给user
        sysUser.setAuthorities(authorities);
        log.info("{}" + sysUser);
        return sysUser;
    }
}
