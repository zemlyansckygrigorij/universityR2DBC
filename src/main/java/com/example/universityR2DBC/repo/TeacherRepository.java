package com.example.universityR2DBC.repo;


import com.example.universityR2DBC.entity.Teacher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TeacherRepository extends ReactiveCrudRepository<Teacher, Long> {
}
