package com.ruyuan2020.im.route.server.command;

import com.ruyuan2020.im.common.protobuf.Command;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.SocketChannel;

import java.util.concurrent.Future;

/**
 * @author zhonghuashishan
 */
public interface ServerCommandHandler {

    void handleCommand(Command command, ChannelHandlerContext ctx);

    int getType();
}
