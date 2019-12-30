package com.pemila.starter.demo;

/**
 * @author pemila
 * @date 2019/12/30 17:43
 **/
public class HelloService {

	private String name;
	private String msg;

	public String sayHello(){
		return name + " said " + msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
