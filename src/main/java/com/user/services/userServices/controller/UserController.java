package com.user.services.userServices.controller;
/* pavankuma.siripurapu created on 1/21/2021 */

import com.user.services.userServices.entity.User;
import com.user.services.userServices.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") int id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent())
            return new ResponseEntity<>(user.get(), HttpStatus.OK);

        return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/user")
    public ResponseEntity<Object> getAllUsers() {
        List<User> users = userService.findAll();
        if (!users.isEmpty())
            return new ResponseEntity<>(users, HttpStatus.OK);

        return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") int id) {
        userService.deleteById(id);
        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }


    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User save = userService.saveUser(user);
        return new ResponseEntity<>("User Created Successfully with id "+save.getId(), HttpStatus.OK);
    }
}
