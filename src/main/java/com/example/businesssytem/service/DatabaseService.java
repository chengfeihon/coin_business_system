package com.example.businesssystem.service;

import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    public void connectToDatabase(String host, int port, String username, String password) {
        System.out.println("Connecting to database at " + host + ":" + port + " with user " + username);
        System.out.println("Database connection successful.");
    }
}
