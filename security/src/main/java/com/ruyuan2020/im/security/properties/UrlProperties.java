package com.ruyuan2020.im.security.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class UrlProperties {

    private String url;

    public UrlProperties() {
    }

    public UrlProperties(String url) {
        this.url = url;
    }
}
