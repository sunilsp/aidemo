package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
