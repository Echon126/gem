package com.demo.gem.gem.entity;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 10:42
 **/
public class NoticeSmsEvent extends SmsEvent {
    public NoticeSmsEvent(Long smsId, String telphone, String content) {
        super(smsId, telphone, content);
    }
}
