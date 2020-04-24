package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Child {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
