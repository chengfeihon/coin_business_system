package com.example.businesssystem;

import com.example.businesssystem.model.User;
import com.example.businesssystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class BusinessSystemApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("testuser@example.com");
        userService.createUser(user);

        List<User> users = userService.getAllUsers();
        Assert.isTrue(users.size() == 1, "User should be created");
        Assert.isTrue(users.get(0).getUsername().equals("testuser"), "Username should match");
    }
}
