package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements UserServiceInterface {
    private static final Map<Integer, User> users;

    static {
        users = new HashMap<>();
        users.put(1, new User(1, "Aaron", 10, "Developer", "Backend"));
        users.put(2, new User(2, "Baron", 20, "Developer", "Frontend"));
        users.put(3, new User(3, "Caron", 30, "Engineer", "DevOps/SRE"));
    }

    public User findById(Integer id) {
        return users.get(id);
    }

    public List<User> findAll() {
        return users.values().stream().toList();
    }
}
