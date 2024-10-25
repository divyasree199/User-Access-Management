package com.Controller;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Service.UserService;
import com.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
	 @Autowired
	    private UserService userService;

	    @PostMapping("/signup")
	    public ResponseEntity<String> signup(@RequestBody User user) {
	        userService.saveUser(user);
	        return ResponseEntity.ok("User registered successfully.");
	    }

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
	        Optional user = userService.findByUsername(username);
	        if (((Object) user).isPresent() && ((User) user.get()).getPassword().equals(password)) {
	            return ResponseEntity.ok("Login successful.");
	        }
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials.");
}
