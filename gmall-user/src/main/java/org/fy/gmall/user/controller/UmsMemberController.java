package org.fy.gmall.user.controller;

import org.fy.gmall.user.bean.UmsMember;
import org.fy.gmall.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员表(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-04-24 23:09:09
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(Long id) {
        return this.umsMemberService.queryById(id);
    }

}