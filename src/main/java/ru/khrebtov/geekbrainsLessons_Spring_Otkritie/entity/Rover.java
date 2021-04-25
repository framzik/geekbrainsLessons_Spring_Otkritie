package ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Rover {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String model;

    public Rover(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
