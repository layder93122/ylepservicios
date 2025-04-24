package com.ylep.ylep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class YlepConfigServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(YlepConfigServidorApplication.class, args);
	}

}
