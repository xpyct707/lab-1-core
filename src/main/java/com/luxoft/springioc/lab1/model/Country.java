package com.luxoft.springioc.lab1.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String codeName;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private A a;


    public Country(int id, String name, String codeName) {
        this.id = id;
        this.name = name;
        this.codeName = codeName;
    }

    public Country(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }
}
