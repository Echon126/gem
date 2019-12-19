package com.demo.gem.gem.listener;

import com.demo.gem.gem.entity.NoticeSmsEvent;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 10:41
 **/
@Slf4j
@Component
public class NoticeSmsListener {

    @Bean
    public AsyncEventBus asyncEventBus() {
        log.info("开始初始化 AsyncEventBus");
        AsyncEventBus asyncEventBus = new AsyncEventBus(Executors.newFixedThreadPool(100));
        asyncEventBus.register(this);
        return asyncEventBus;
    }

    //注册这个监听器
   /* @Bean
    public void register() {
        log.info("开始初始化 AsyncEventBus");
        //asyncEventBus = new AsyncEventBus(Executors.newFixedThreadPool(100));
        asyncEventBus().register(this);
    }*/

  /*  @Subscribe
    @AllowConcurrentEvents
    public void sendSms(NoticeSmsEvent object) throws InterruptedException {
        //Thread.sleep(3000);
        log.info("--------订阅信息-----------" + object.toString());

    }*/

    /**
     * @Subscribe 标识订阅者
     *
     * @AllowConcurrentEvents 标识当前订阅者时线程安全的
     *
     * guava 会对listener对象遍历带有@Subscribe注解的所有方法，然后对针对每一个listener对象和method方法，标识唯一一个订阅者。
     * 找到唯一识别的观察者后，会对该观察者进行包装wrap，包装成一个EventSubscriber对象，对于没有@AllowConcurrentEvents注解的方法，
     * 会被包装成SynchronizedEventSubscriber，即同步订阅者对象。
     *
     *
     */

}
