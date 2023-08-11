package com.ruyuan2020.im.client.tcp;

import com.ruyuan2020.im.common.protobuf.Command;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author zhonghuashishan
 */
public interface CommandHandler {

    void handleCommand(Command command, ChannelHandlerContext ctx, TcpClient tcpClient);

    int getType();
}
