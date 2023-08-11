package com.ruyuan2020.im.route.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class HeartbeatProperties {


    /**
     * 心跳超时
     */
    private int readTimeout = 30000;
}
