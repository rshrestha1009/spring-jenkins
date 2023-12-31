package com.restExample.restfulwebservice.User;

import com.restExample.restfulwebservice.User.User;
import com.restExample.restfulwebservice.User.UserDaoService;
import com.restExample.restfulwebservice.User.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id){
        User user =  service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("id:" + id);
        }
        return user;
    }


    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteById(id);
        if(user == null){
            throw new UserNotFoundException("id:" + id);
        }
    }
}
