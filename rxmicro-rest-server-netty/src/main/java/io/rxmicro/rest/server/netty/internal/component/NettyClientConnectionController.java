/*
 * Copyright (c) 2020. https://rxmicro.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rxmicro.rest.server.netty.internal.component;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.AttributeKey;
import io.rxmicro.logger.Logger;
import io.rxmicro.logger.LoggerFactory;
import io.rxmicro.rest.server.netty.NettyRestServerConfig;

import java.time.Duration;

import static io.rxmicro.common.util.Formats.format;
import static io.rxmicro.common.util.Requires.require;

/**
 * @author nedis
 * @since 0.7
 */
final class NettyClientConnectionController extends ChannelInitializer<SocketChannel> {

    private static final AttributeKey<Long> CHANNEL_TTL = AttributeKey.valueOf("CHANNEL_TTL");

    private static final Logger LOGGER = LoggerFactory.getLogger(NettyClientConnectionController.class);

    private final NettyRestServerConfig nettyRestServerConfig;

    NettyClientConnectionController(final NettyRestServerConfig nettyRestServerConfig) {
        this.nettyRestServerConfig = require(nettyRestServerConfig);
    }

    @Override
    protected void initChannel(final SocketChannel ch) {
        if (LOGGER.isTraceEnabled()) {
            ch.attr(CHANNEL_TTL).set(System.nanoTime());
            LOGGER.trace(
                    "Client connection created: Channel=?, IP=?",
                    nettyRestServerConfig.getChannelIdType().getId(ch.id()), ch.remoteAddress()
            );
        }
        nettyRestServerConfig.getHandlerSuppliers().forEach(s -> ch.pipeline().addLast(s.get()));
        ch.closeFuture().addListener(future -> {
                    if (LOGGER.isTraceEnabled()) {
                        LOGGER.trace(
                                "Client connection closed: Channel=?, IP=?, TTL=?",
                                nettyRestServerConfig.getChannelIdType().getId(ch.id()),
                                ch.remoteAddress(),
                                format(Duration.ofNanos(System.nanoTime() - ch.attr(CHANNEL_TTL).get()))
                        );
                    }
                }
        );
    }
}