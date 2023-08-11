package com.ruyuan2020.im.security.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class CodeProperties {

    private CaptchaProperties captcha = new CaptchaProperties();

    private SmsProperties sms = new SmsProperties();
}
