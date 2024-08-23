package com.example.demo.Service;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public void register(User user) {
        users.add(user);
    }

    public User login(String username, String password) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
    public List<User> getAllUsers(){
        return users;
    }
    public Optional<User> getUserById(String id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public void deleteUserById(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
