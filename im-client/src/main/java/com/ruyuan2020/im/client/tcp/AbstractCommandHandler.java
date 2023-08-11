package com.ruyuan2020.im.client.tcp;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhonghuashishan
 */
public abstract class AbstractCommandHandler implements CommandHandler {

    protected final ThreadPoolExecutor executor;

    public AbstractCommandHandler(ThreadPoolExecutor executor) {
        this.executor = executor;
    }
}
