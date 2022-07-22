package com.example.universityR2DBC.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.*;
import org.springframework.data.annotation.*;

/**
 * @author Grigoriy Zemlyanskiy
 * @version 1.0
 * class Group
 */

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "subject")
public class Subject {
    @Id
    @EqualsAndHashCode.Include()
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
}