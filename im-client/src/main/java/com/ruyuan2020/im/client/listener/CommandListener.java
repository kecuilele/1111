package com.ruyuan2020.im.client.listener;

import com.ruyuan2020.im.common.protobuf.Command;

/**
 * @author zhonghuashishan
 */
public interface CommandListener {

    void onCommand(Command command);
}
