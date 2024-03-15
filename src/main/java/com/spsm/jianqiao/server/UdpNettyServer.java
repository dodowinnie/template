package com.spsm.jianqiao.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UdpNettyServer implements Runnable {

    @Value("${socket.udp.port}")
    private Integer port;

    @Value("${socket.udp.ip}")
    private String ip;

    @Autowired
    private LocationHandler locationHandler;

    @Override
    public void run() {
        EventLoopGroup workGroup = new NioEventLoopGroup(10);
        Bootstrap bootstrap = new Bootstrap();
        try {
            bootstrap.group(workGroup);
            bootstrap.channel(NioDatagramChannel.class);
            bootstrap.handler(locationHandler);
            bootstrap.option(ChannelOption.SO_KEEPALIVE,true);
            bootstrap.option(ChannelOption.SO_BROADCAST, true);
            // 接受缓冲区的容量上限 2M
            bootstrap.option(ChannelOption.SO_RCVBUF, 2048*1024);
            // 发送缓冲区的容量上限
            bootstrap.option(ChannelOption.SO_SNDBUF, 1024*1024);
            ChannelFuture future = bootstrap.bind(ip, port).sync();
            log.info("【Location】 服务端启动开始监听端口：" + port);
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error("【Location】 netty server start error :" + e);
        } finally {
            workGroup.shutdownGracefully();
        }
    }
}
