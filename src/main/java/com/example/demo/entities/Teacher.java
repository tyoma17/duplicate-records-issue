package com.example.demo.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TEACHERS")
public class Teacher  {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "teacher")
    List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

}
