package com.demo.gem.gem;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.demo.gem.gem.entity.NoticeSmsEvent;
import com.google.common.eventbus.AsyncEventBus;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GemApplicationTests {
    @Autowired
    private AsyncEventBus asyncEventBus;
/*
    @Before
    public void before(){
        asyncEventBus=new AsyncEventBus(Executors.newFixedThreadPool(3));
        asyncEventBus.register(this);
    }*/
/*
    @Subscribe
    @AllowConcurrentEvents
    public void subscribe(Object object){
        System.out.println("收到:"+object);
    }*/

    //-----------------------------------------------guava 事件发布订阅---------------------------------------------------------------
    @Test
    public void test_sendMsg() throws InterruptedException {
        System.out.println("开始发送消息");
        NoticeSmsEvent noticeSmsEvent = new NoticeSmsEvent(100L, "15620742723", "回到家乡");
        asyncEventBus.post(noticeSmsEvent);
        System.out.println("开始睡眠");
        //TimeUnit.SECONDS.sleep(5L);

    }

    //-----------------------------------------------java 线程池测试---------------------------------------------------------------
    private final static ExecutorService executorService = Executors.newFixedThreadPool(2);

    @Test
    public void test_Executors() {
        log.info("111111111111111111111111111111111111");
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    log.info("xxxxxxxxxxxxxxxxxxx" + finalI);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }
        log.info("2222222222222222222222222222222");

    }
}
