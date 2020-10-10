package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

	@SpringBootApplication
	@EnableEurekaServer //开启服务注册中心
	public class SpringcloudserverApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringcloudserverApplication.class, args);
		}

}
