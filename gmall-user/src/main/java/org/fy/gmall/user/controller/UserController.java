package org.fy.gmall.user.controller;

import org.fy.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fy
 * @create 2020/04/24 18:47
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
}
