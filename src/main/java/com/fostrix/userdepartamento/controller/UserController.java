package com.fostrix.userdepartamento.controller;

import com.fostrix.userdepartamento.model.User;
import com.fostrix.userdepartamento.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User resultId = userRepository.findById(id).orElse(null);
        return resultId;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping
    public void delete(@RequestBody User user){
        userRepository.delete(user);
    }
}
