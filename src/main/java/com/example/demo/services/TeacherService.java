package com.example.demo.services;

import com.example.demo.DTOs.TeacherDTO;
import com.example.demo.entities.Teacher;
import com.example.demo.mappers.TeacherToDTOMapper;
import com.example.demo.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherToDTOMapper teacherToDTOMapper;

    public Page<TeacherDTO> findAll(Pageable pageable) {
        Specification<Teacher> specification = (root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.lessThanOrEqualTo(root.get("id"), 2);
        };
        return teacherRepository.findAll(specification, pageable).map(teacherToDTOMapper::mapEntityToDTO);
    }
}
