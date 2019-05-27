package com.demo.gem.gem.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.gem.gem.entity.Userinfo;
import com.demo.gem.gem.service.impl.UserinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author BaoZhou
 * @since 2019-04-27
 */
@RestController
public class UserinfoController {
    @Autowired
    UserinfoServiceImpl userinfoService;

    @RequestMapping("/test/userinfo")
    public void insert() {
        Userinfo userinfo = new Userinfo();
        userinfo.setId(1);
        userinfo.setName("s");
        userinfo.setAddress("as");
        userinfo.setSex("sds");
        //userinfo.setCreateTime(new Date());
        this.userinfoService.save(userinfo);
    }

    @RequestMapping("/test/userinfos")
    public void select() {
        QueryWrapper<Userinfo> q =new QueryWrapper<>();
        List<Userinfo> list = this.userinfoService.list(q);
        list.forEach(System.out::println);
    }

    @RequestMapping("/test/delete")
    public void delete() {
        List<String> list = new ArrayList();
        this.userinfoService.removeByIds(list);
    }
}

