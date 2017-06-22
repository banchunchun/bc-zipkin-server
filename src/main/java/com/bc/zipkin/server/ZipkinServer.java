package com.bc.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-06-22
 * Time:  下午 7:29.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableDiscoveryClient //注册到eureka
@EnableZipkinStreamServer //使用Stream方式启动ZipkinServer
public class ZipkinServer {


    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer.class, args);
    }

}
