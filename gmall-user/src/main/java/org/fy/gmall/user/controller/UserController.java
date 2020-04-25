package org.fy.gmall.user.controller;

import org.fy.gmall.bean.UmsMember;
import org.fy.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fy
 * @create 2020/04/24 18:47
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
      List<UmsMember> umsMembers=userService.getAllUser();
      return umsMembers;
    }
    @GetMapping("/index")
    public String test(){
        return "hello user";
    }
}
