package com.Service;


import org.apache.el.stream.Optional;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Respository.UserRepository;
import com.entity.User;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        user.setRole("Employee");
        return userRepository.save(user);
    }

    public Optional findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
