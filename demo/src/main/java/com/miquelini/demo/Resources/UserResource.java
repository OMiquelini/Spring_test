package com.miquelini.demo.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miquelini.demo.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll()
    {
        User u = new User(1L,"Miquelini","miquelini.matheus@gmail.com","1234");
        return ResponseEntity.ok().body(u);
    }
    
}
