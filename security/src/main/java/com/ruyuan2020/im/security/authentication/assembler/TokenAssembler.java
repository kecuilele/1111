package com.ruyuan2020.im.security.authentication.assembler;

import com.ruyuan2020.im.common.security.token.oauth2.Oauth2AuthenticationToken;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhonghuashishan
 */
public interface TokenAssembler {

    Oauth2AuthenticationToken assemble(HttpServletRequest request);
}
