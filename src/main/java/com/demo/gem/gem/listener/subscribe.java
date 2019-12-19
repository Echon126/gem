package com.demo.gem.gem.listener;

import com.demo.gem.gem.entity.NoticeSmsEvent;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 14:29
 **/
@Slf4j
@Component
public class subscribe {

    @Subscribe
    @AllowConcurrentEvents
    public void sendSms(NoticeSmsEvent object) throws InterruptedException {
        //Thread.sleep(3000);
        log.info("--------订阅信息-----------" + object.toString());

    }
}
