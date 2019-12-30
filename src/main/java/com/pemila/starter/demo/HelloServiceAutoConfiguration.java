package com.pemila.starter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pemila
 * @date 2019/12/30 17:45
 **/
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

	@Autowired
	HelloProperties helloProperties;

	@Bean
	HelloService helloService(){
		HelloService helloService = new HelloService();
		helloService.setMsg(helloProperties.getMessage());
		helloService.setName(helloProperties.getName());
		return helloService;
	}
}
