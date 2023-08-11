package com.ruyuan2020.im.auth.remote;

/**
 * @author zhonghuashishan
 */
public interface Remote<T> {

    T login(String username, String password);

    T loginByMobile(String mobile);

    T loginByUnionId(String unionId);
}
