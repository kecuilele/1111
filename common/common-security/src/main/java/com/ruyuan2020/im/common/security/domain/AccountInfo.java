package com.ruyuan2020.im.common.security.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class AccountInfo extends AuthInfo {

    private String nickname;

    private String status;
}
