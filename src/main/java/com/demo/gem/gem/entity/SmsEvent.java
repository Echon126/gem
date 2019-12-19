package com.demo.gem.gem.entity;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-12-19 10:40
 **/

public class SmsEvent {
    private Long smsId;
    private String telphone;
    private String content;

    public SmsEvent(Long smsId, String telphone, String content) {
        this.smsId = smsId;
        this.telphone = telphone;
        this.content = content;
    }

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SmsEvent{" +
                "smsId=" + smsId +
                ", telphone='" + telphone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
