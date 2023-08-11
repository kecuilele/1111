package com.ruyuan2020.im.common.im.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class FetchOfflineJsonRequest {

    private Integer chatType;

    private Long memberId;

    private Long chatId;

    private Integer clientId;

    private Long lastMessageId;
}
