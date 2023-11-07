package com.example.wpvezbam.repository;

import com.example.wpvezbam.entity.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FootballerRepository extends JpaRepository<Footballer, Long> {
}
