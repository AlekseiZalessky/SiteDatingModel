package by.custom.site.service;

import by.custom.site.models.User;
import by.custom.site.repository.UserRepository;

import java.util.Map;

public class UserService {
    private UserRepository userRepository;
    private Map<String, User> users;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.users = userRepository.getUsers();
    }
}

