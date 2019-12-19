package com.demo.gem.gem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 11:43
 **/
@Slf4j
@RestController
public class TestThread {
    //--------------------------------------------------------------------------------------------------------------
    private final static ExecutorService executorService = Executors.newFixedThreadPool(1);

    @RequestMapping("/test-001")
    public void testThead(){
        log.info("111111111111111111111111111111111111");
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    log.info("xxxxxxxxxxxxxxxxxxx" + finalI);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }
        log.info("2222222222222222222222222222222");
    }
}
