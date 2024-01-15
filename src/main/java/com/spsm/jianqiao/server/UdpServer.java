package com.spsm.jianqiao.server;

import com.spsm.jianqiao.esb.ILocationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.ip.dsl.Udp;
import org.springframework.integration.ip.dsl.UdpInboundChannelAdapterSpec;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

@Configuration
public class UdpServer {

    @Autowired
    private ILocationRecordService recordService;

    @Value("${udp.listeningPort}")
    private int listeningPort;

    @Bean
   public IntegrationFlow integrationFlow(){
       UdpInboundChannelAdapterSpec inboundAdapter = Udp.inboundAdapter(listeningPort);
       return IntegrationFlows.from(inboundAdapter).channel("udpChannel").get();
   }

    @Transformer(inputChannel = "udpChannel", outputChannel = "udpHandler")
    public String transformer(@Payload byte[] payload, @Headers Map<String, Object> headers) {
        String message = new String(payload);
        return message;
    }

    @ServiceActivator(inputChannel = "udpHandler")
    public void udpMessageHandle(String message, @Headers Map<String, Object> headers) throws Exception {
        // 可以进行异步处理
        recordService.saveRecord(message);
    }

}
