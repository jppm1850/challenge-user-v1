package com.junior.pecho.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "APIs", version = "3.0", description = "Documentation APIs v3.0" ))
public class SwaggerConfiguration {
}
