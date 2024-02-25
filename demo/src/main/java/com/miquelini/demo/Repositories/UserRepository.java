package com.miquelini.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miquelini.demo.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
