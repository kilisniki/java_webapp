package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.CounterRepository;
import com.example.demo.model.Counter;

@RestController
public class HelloWorldController {

    @Autowired
    private CounterRepository counterRepository;

    @GetMapping("/hello")
    public String helloWorld() {
        Counter counter = counterRepository.findById(1L).orElse(new Counter(1L, 0));
        counter.setCount(counter.getCount() + 1);
        counterRepository.save(counter);
        return "Hello World! Current count: " + counter.getCount();
    }
}
