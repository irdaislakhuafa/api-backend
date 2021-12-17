package com.sample.apibackend.configurations;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket docs() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sample.apibackend.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                        new ApiInfo(
                                "Sample Backend API Documentation",
                                "This is simple documentation for my api-backend",
                                "0.1",
                                "mailto:irdhaislakhuafa@gmail.com",
                                new Contact(
                                        "Irda Islakhu Afa",
                                        "https://github.com/irdaislakhuafa",
                                        "irdhaislakhuafa@gmail.com"),
                                "Apache License",
                                "https://www.apache.org/licenses/LICENSE-2.0",
                                Collections.emptyList()));
    }
}
