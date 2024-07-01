package com.example.businesssystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class AppConfig {

    @Value("${database.host}")
    private String dbHost;

    @Value("${database.port}")
    private int dbPort;

    @Value("${database.username}")
    private String dbUsername;

    @Value("${database.password}")
    private String dbPassword;

    @Value("${server.url}")
    private String serverUrl;

    @Value("${server.admin.username}")
    private String serverAdminUsername;

    @Value("${server.admin.password}")
    private String serverAdminPassword;

    @Bean
    public void printConfig() {
        System.out.println("Database Configurations:");
        System.out.println("Host: " + dbHost);
        System.out.println("Port: " + dbPort);
        System.out.println("Username: " + dbUsername);
        System.out.println("Password: " + dbPassword);

        System.out.println("Server Configurations:");
        System.out.println("URL: " + serverUrl);
        System.out.println("Admin Username: " + serverAdminUsername);
        System.out.println("Admin Password: " + serverAdminPassword);
    }
}
