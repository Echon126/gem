/*
package com.demo.gem.gem.configuration;

import com.google.common.eventbus.AsyncEventBus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

*/
/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 10:37
 **//*

@Slf4j
@Configuration
public class EventConfiguration {

    @Bean
    public AsyncEventBus asyncEventBus(){
        log.info("开始初始化 AsyncEventBus");
        return new AsyncEventBus(Executors.newFixedThreadPool(100));
    }
}
*/
