package com.test.UserApi.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.test.UserApi.model.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {

	 public User findById(int id); 
}
