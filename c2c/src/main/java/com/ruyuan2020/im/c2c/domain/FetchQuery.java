package com.ruyuan2020.im.c2c.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class FetchQuery {

    private Long chatId;

    private Long startMessageId;

    private Long stopMessageId;

    private Integer size;
}
