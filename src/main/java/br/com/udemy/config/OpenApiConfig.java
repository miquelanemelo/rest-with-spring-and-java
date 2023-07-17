package br.com.udemy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenApi() {
		
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 18 and Spring Boot 3")
						.version("v1")
						.description("Description about my API")
						.termsOfService("https://pub.udemy.com.br/meus-cursos")
						.license(new License().name("Apache 2.0")
								.url("https://pub.udemy.com.br/meus-cursos")));
		
	}

}
