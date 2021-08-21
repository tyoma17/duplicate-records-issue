package com.example.demo.mappers;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentToDTOMapper {

    public StudentDTO mapEntityToDTO(Student entity) {
        return new StudentDTO(entity.getId(), entity.getName(), entity.getSurname());
    }

}
