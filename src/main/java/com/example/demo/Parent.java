package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
class Parent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private List<Child> children;
}
