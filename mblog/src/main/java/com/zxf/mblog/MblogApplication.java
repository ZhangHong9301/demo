package com.zxf.mblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxf.mblog.mapper")
public class MblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MblogApplication.class, args);
	}

}

