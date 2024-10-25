package com.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Software;

public interface Softwarerepository extends JpaRepository<Software,Long> {}

