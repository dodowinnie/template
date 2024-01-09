package com.spsm.jianqiao;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = {"com.spsm.jianqiao.mapper"})
public class JianqiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianqiaoApplication.class, args);
        log.info("============= JianqiaoApplication Start =============");
    }

}
