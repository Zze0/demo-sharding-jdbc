package com.zze0.demo.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@MapperScan("com.zze0.demo.shardingjdbc.mapper")
public class ShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcApplication.class, args);
	}

}
