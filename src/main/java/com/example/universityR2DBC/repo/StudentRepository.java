package com.example.universityR2DBC.repo;

import com.example.universityR2DBC.entity.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {
}
