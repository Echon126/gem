package com.demo.gem.gem;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.demo.gem.gem.mapper*")
public class GemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemApplication.class, args);
	}

	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}


	//TODO https://blog.csdn.net/m0_37034294/article/details/82917234

}
