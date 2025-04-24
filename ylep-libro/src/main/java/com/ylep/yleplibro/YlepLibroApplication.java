package com.ylep.yleplibro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class YlepLibroApplication {

	public static void main(String[] args) {
		SpringApplication.run(YlepLibroApplication.class, args);
	}

}
