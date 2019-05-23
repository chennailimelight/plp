package com.cg.plp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.capStoreBack.model.User;

@CrossOrigin(origins = "http://localhost:4200")
public interface CapstoreUserDao extends JpaRepository<User,Integer> {

	
	public Optional<User> findByEmail(String email);

	@Query("SELECT user FROM User user where user.email=?1 AND user.password=?2")
	public User findByEmailAndPassword(String email,String password);
}
