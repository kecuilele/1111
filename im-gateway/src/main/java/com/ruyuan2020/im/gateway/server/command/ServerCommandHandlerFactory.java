package com.ruyuan2020.im.gateway.server.command;

import com.ruyuan2020.im.common.core.exception.SystemException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhonghuashishan
 */
@Component
@RequiredArgsConstructor
public class ServerCommandHandlerFactory {

    private final List<ServerCommandHandler> commandHandlers;

    public ServerCommandHandler getCommandHandler(int type) {
        for (ServerCommandHandler commandHandler : commandHandlers) {
            if (type == commandHandler.getType()) {
                return commandHandler;
            }
        }
        throw new SystemException("找不到命令处理器");
    }
}
