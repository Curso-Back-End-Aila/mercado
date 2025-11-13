package br.com.senai.backend.sistema_mercado.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API de um Sistema de Mercado",
        version = "1.0",
        description = "API para o sistema de Mercado"
    )
)
public class Swagger {

}