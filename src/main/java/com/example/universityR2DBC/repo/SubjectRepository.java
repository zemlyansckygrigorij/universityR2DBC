package com.example.universityR2DBC.repo;

import com.example.universityR2DBC.entity.Subject;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SubjectRepository  extends ReactiveCrudRepository<Subject, Long> {
}
