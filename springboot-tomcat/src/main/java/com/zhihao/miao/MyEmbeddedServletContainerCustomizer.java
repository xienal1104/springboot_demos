package com.zhihao.miao;

import java.io.File;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

	public void customize(ConfigurableEmbeddedServletContainer container) {
		//org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory
		//System.out.println(container.getClass().getName());
		
		TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory)container;
		factory.setPort(10003);
		factory.setBaseDirectory(new File("e:/tmp/tomcat"));
		factory.addConnectorCustomizers(new myTomcatConnectorCustomizer());
	}
	
	class myTomcatConnectorCustomizer implements TomcatConnectorCustomizer{
		
		public void customize(Connector connector) {
			//HTTP/1.1
			System.out.println("==========="+connector.getProtocol());
			//class org.apache.coyote.http11.Http11NioProtocol
			System.out.println("==========="+connector.getProtocolHandler().getClass());
		}
		
	}
	
	

}
