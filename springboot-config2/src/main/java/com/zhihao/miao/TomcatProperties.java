package com.zhihao.miao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("ds")
public class TomcatProperties {
	private List<String> hosts = new ArrayList<String>();
	
	private String[] ports;

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}
	
	public String[] getPorts() {
		return ports;
	}

	public void setPorts(String[] ports) {
		this.ports = ports;
	}

	public void show(){
		System.out.println("hosts======"+this.hosts);
		System.out.println("posts======"+Arrays.asList(this.ports));
	}

}
