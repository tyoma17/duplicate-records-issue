package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;

    @ManyToOne
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
