package com.Respository;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

Optional findByUsername(String username);
//	Optional<User> findByUsername(String username);
}
