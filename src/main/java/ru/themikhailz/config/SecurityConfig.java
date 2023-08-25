package ru.themikhailz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import ru.themikhailz.security.JwtAuthenticationFilter;
import ru.themikhailz.service.AuthService;
import ru.themikhailz.service.AuthServiceImpl;
import ru.themikhailz.service.JwtService;

@Configuration
@Import({AuthenticationConfiguration.class, LibConfig.class})
public class SecurityConfig {

    @Bean
    public JwtService jwtService() {
        return new JwtService();
    }

    @Bean
    public AuthService authService() {
        return new AuthServiceImpl();
    }

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService) {
        return new JwtAuthenticationFilter(jwtService);
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

}
