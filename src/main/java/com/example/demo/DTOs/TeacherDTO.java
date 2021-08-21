package com.example.demo.DTOs;

import java.util.List;

public class TeacherDTO {

    private Long id;
    private String name;
    private String surname;
    private List<StudentDTO> students;

    public TeacherDTO(Long id, String name, String surname, List<StudentDTO> students) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

}
