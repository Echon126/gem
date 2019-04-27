package com.demo.gem.gem.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.demo.gem.gem.entity.Userinfo;
import com.demo.gem.gem.service.impl.UserinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
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
        this.userinfoService.insert(userinfo);
    }

    @RequestMapping("/test/userinfos")
    public void select(){
        Wrapper<Userinfo> wrapper = new EntityWrapper<Userinfo>();
        wrapper.setSqlSelect("id","name");

        List<Userinfo> list=this.userinfoService.selectList(wrapper);
        list.forEach(System.out::println);
    }
    @RequestMapping("/test/delete")
    public void delete(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","s");
       this.userinfoService.deleteByMap(map);
    }
}

