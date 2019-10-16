package com.luxoft.springioc.lab1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UsualPerson implements Person {
    private int id;
    private String name;
    private Country country;

    private int age;
    private float height;
    private boolean isProgrammer;

    private List<String> contacts;


    public UsualPerson(String name, Country country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public void sayHello(Person person) {
    }
}