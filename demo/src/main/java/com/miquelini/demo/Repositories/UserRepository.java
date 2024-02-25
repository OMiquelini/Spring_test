package com.miquelini.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miquelini.demo.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
