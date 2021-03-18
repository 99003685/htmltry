package com.ltts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
