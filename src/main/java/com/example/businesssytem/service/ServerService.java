package com.example.businesssystem.service;

import org.springframework.stereotype.Service;

@Service
public class ServerService {

    public void startServer(String url, String adminUsername, String adminPassword) {
        System.out.println("Starting server at " + url + " with admin user " + adminUsername);
        // 伪造的服务器启动逻辑
        System.out.println("Server started successfully.");
    }
}
