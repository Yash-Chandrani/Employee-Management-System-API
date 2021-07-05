package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {	
		System.out.println("======");
		SpringApplication.run(SpringBootFirstApplication.class, args);
	}
	@Bean
	public Docket myApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com"))
				.build()
				.apiInfo(apiInfo())
				;
	}
	
	private  ApiInfo apiInfo() {
		
		ApiInfo ap = new ApiInfo("Spring-boot-first", "dummy rest api", "1", "www.tos.com","Tejas Shah", "Apache 2.0", "www.apache.com");
		return ap;
	}

}
