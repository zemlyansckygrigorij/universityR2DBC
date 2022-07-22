package com.example.universityR2DBC.repo;


import com.example.universityR2DBC.entity.Group;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;



@Repository
interface GroupRepository extends ReactiveCrudRepository<Group, Long> {
    @Query("select max(id) from groups")
    long getMaxId();
}

