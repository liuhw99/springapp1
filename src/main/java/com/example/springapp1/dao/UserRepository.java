package com.example.springapp1.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springapp1.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
