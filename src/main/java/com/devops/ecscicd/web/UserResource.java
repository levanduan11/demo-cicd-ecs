package com.devops.ecscicd.web;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.ecscicd.domain.User;
import com.devops.ecscicd.repository.UserRepository;

//@RestController
//@RequestMapping(("api/v1/users"))
public class UserResource {
    // private final UserRepository userRepository;

    // public UserResource(UserRepository userRepository) {
    //     this.userRepository = userRepository;
    // }

    // @GetMapping
    // public List<User> getAll() {
    //     return userRepository.findAll();
    // }

    // @GetMapping("/{id}")
    // public User getById(@PathVariable Long id) {
    //     return userRepository.findById(id)
    //             .orElseThrow(NoSuchElementException::new);
    // }
}
