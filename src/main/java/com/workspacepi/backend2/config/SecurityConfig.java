package com.workspacepi.backend2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/registro/cep/**").permitAll() // Permite acesso sem autenticação ao endpoint de CEP
                        .requestMatchers("/admin/**").hasRole("ADMIN") // Somente ADMIN pode acessar
                        .requestMatchers("/user/**").hasRole("USER") // Somente USER pode acessar
                        .anyRequest().authenticated() // Todas as outras requisições precisam de autenticação
                );


        return http.build();
    }
}
