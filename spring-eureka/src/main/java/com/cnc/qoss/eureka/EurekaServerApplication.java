package com.cnc.qoss.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wush1
 * @version 1.0  2018/10/28
 * @since 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
