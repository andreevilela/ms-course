package com.andre.hroauth.resources;

import com.andre.hroauth.entities.User;
import com.andre.hroauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) throws IllegalAccessException {
        try {
            User user = userService.findByEmail(email);
            return ResponseEntity.ok(user);
        } catch (IllegalAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
