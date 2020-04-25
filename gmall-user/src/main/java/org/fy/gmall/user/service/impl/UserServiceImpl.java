package org.fy.gmall.user.service.impl;

import org.fy.gmall.bean.UmsMember;
import org.fy.gmall.user.mapper.UserMapper;
import org.fy.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fy
 * @create 2020/04/24 18:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList =userMapper.selectAllUser();
        return umsMemberList;
    }
}
