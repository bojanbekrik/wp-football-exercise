package com.example.wpvezbam.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "footballer", schema = "public")
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    public Footballer(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Footballer() {
//    }
}
