package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webdev.model.Users;

public interface UserRepository extends JpaRepository<Users, String> {
	@Query(value = "SELECT * FROM Users WHERE username = ?1", nativeQuery = true)
	Users findUsersByusername(String username);

}
