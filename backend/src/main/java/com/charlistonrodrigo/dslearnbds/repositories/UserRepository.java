package com.charlistonrodrigo.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlistonrodrigo.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
