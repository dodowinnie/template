package com.spsm.jianqiao.server;

import com.spsm.jianqiao.esb.ILocationRecordService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Autowired
    private ILocationRecordService recordService;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {

        ByteBuf buf = packet.copy().content();
        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);
        String message = new String(bytes);
        recordService.saveRecord(message);
    }
}
