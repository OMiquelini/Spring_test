package com.miquelini.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.miquelini.demo.Entities.User;
import com.miquelini.demo.Repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Matheus","matheus.andrello@gmail.com","1234");
        User u2 = new User(null, "Marcos","marcos.andrello@gmail.com","1234");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }



}
