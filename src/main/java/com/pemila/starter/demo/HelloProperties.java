package com.pemila.starter.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pemila
 * @date 2019/12/30 17:36
 **/
@ConfigurationProperties(prefix = "custom.pemila.starter")
public class HelloProperties {
	private static final String DEFAULT_NAME = "Pemila";
	private static final String DEFAULT_MSG = "Today is a good day!";

	private String name = DEFAULT_NAME;
	private String message = DEFAULT_MSG;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
