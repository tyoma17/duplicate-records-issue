package com.example.demo.repositories;

import com.example.demo.entities.Teacher;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long>, JpaSpecificationExecutor<Teacher> {
}
