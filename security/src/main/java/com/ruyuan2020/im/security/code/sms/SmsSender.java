package com.ruyuan2020.im.security.code.sms;

/**
 * 短信发送器
 *
 * @author zhonghuashishan
 */
public interface SmsSender {

    void send(String mobile, String code);
}
