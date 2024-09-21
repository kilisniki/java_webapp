package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Counter;

public interface CounterRepository extends JpaRepository<Counter, Long> {}
