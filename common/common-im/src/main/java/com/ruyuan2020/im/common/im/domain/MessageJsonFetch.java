package com.ruyuan2020.im.common.im.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class MessageJsonFetch {

    private Long chatId;

    private Long toId;

    private Integer chatType;
}
