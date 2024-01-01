package com.dev.ed.infrastructure.config;

import com.dev.ed.application.service.ClienteService;
import com.dev.ed.application.usecase.ClienteServiceImpl;
import com.dev.ed.domain.ports.out.ClienteOut;
import com.dev.ed.infrastructure.repository.adapter.ClienteRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ClienteService clienteService(ClienteOut clienteOut){
        return new ClienteService(new ClienteServiceImpl(clienteOut));
    }

    @Bean
    public ClienteOut clienteOut(ClienteRepositoryAdapter clienteRepositoryAdapter){
        return clienteRepositoryAdapter;
    }
}
