package com.example.demo.mappers;

import com.example.demo.DTOs.TeacherDTO;
import com.example.demo.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class TeacherToDTOMapper {

    @Autowired
    private StudentToDTOMapper studentToDTOMapper;

    public TeacherDTO mapEntityToDTO(Teacher entity) {
        return new TeacherDTO(entity.getId(), entity.getName(), entity.getSurname(), entity.getStudents().stream().map(studentToDTOMapper::mapEntityToDTO).collect(Collectors.toList()));
    }

}
