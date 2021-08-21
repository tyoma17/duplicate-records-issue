package com.example.demo.controllers;

import com.example.demo.DTOs.TeacherDTO;
import com.example.demo.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    @ResponseStatus(HttpStatus.OK)
    public PagedModel<EntityModel<TeacherDTO>> findAll(PagedResourcesAssembler<TeacherDTO> resourcesAssembler, Pageable pageable) {
        Page<TeacherDTO> page = teacherService.findAll(pageable);
        return resourcesAssembler.toModel(page);
    }
}
