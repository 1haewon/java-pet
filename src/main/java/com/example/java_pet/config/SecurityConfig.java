package com.example.java_pet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())                      // (암기해야함)

                // 또는 Customizer.withDefaults() 로 명시적 기본 동작 유지
                // .csrf(Customizer.withDefaults())                  // enable 상태 유지

                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()                      // (암기해야함)
                );
        return http.build();

    }
}
