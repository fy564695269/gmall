package org.fy.gmall.user.service.impl;

import org.fy.gmall.user.mapper.UserMapper;
import org.fy.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fy
 * @create 2020/04/24 18:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
