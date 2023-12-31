package com.ruyuan2020.im.gateway.route.command;

import cn.hutool.json.JSONUtil;
import com.ruyuan2020.im.common.im.constant.CommandType;
import com.ruyuan2020.im.common.im.domain.JsonCommand;
import com.ruyuan2020.im.common.im.domain.MessageJsonFetch;
import com.ruyuan2020.im.common.protobuf.Command;
import com.ruyuan2020.im.common.protobuf.MessageFetch;
import com.ruyuan2020.im.gateway.client.ClientManager;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author zhonghuashishan
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class MessageFetchClientCommandHandler extends AbstractClientCommandHandler {

    private final ClientManager clientManager;

    @Override
    public void handleProtoCommand(Command command, ChannelHandlerContext ctx) {
        SocketChannel clientChannel = clientManager.getChannel(command.getUserId(), command.getClient());
        clientChannel.writeAndFlush(command);
    }

    @SneakyThrows
    @Override
    public void handleJsonCommand(Command command, ChannelHandlerContext ctx) {
        MessageFetch body = MessageFetch.parseFrom(command.getBody());

        JsonCommand jsonCommand = JsonCommand.convert(command);
        MessageJsonFetch data = new MessageJsonFetch();
        data.setChatType(body.getChatType());
        data.setToId(body.getToId());
        data.setChatId(body.getChatId());
        jsonCommand.setBody(JSONUtil.parseObj(data));
        SocketChannel clientChannel = clientManager.getChannel(command.getUserId(), command.getClient());
        if (Objects.nonNull(clientChannel)) {
            clientChannel.writeAndFlush(new TextWebSocketFrame(JSONUtil.toJsonStr(jsonCommand)));
        }
    }

    @Override
    public int getType() {
        return CommandType.COMMAND_MESSAGE_FETCH;
    }
}
