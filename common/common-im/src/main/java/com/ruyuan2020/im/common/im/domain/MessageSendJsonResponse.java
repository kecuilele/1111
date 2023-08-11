package com.ruyuan2020.im.common.im.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class MessageSendJsonResponse {

    private Long chatId;

    private Integer chatType;

    private Long fromId;

    private Long toId;

    private Long messageId;

    private Long sequence;

    private Long timestamp;
}
