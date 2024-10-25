package com.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Request;

public interface RequestRepository extends JpaRepository<Request,Long>{
	List<Request> findByStatus(String status);
}
