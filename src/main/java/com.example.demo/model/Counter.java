package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Counter {

    @Id
    private Long id;
    private int count;

    // Конструкторы, геттеры и сеттеры
    public Counter() {}

    public Counter(Long id, int count) {
        this.id = id;
        this.count = count;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
