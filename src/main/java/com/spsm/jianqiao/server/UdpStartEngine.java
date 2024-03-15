package com.spsm.jianqiao.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class UdpStartEngine implements CommandLineRunner {

    @Autowired
    private UdpNettyServer udpNettyServer;

    private Thread udpThread;


    @Override
    public void run(String... args) throws Exception {
        Thread thread = new Thread(udpNettyServer);
        thread.start();

    }
}
