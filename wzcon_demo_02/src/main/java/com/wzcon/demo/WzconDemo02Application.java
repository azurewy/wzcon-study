package com.wzcon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages={"com.wzcon.demo"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.wzcon.demo.repository") // JPA扫描该包路径下的Repositorie
@EntityScan("com.wzcon.demo.entity") // 扫描实体类
@SpringBootApplication
@EnableScheduling
public class WzconDemo02Application {

	public static void main(String[] args) {
		SpringApplication.run(WzconDemo02Application.class, args);
	}

}
