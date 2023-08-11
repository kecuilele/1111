package com.ruyuan2020.im.auth.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zhonghuashishan
 */
@Data
public class SmsLogQuery {

    private String mobile;

    private String ip;

    private LocalDateTime getGmtCreate;
}
