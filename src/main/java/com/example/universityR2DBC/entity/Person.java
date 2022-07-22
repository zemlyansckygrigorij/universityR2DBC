package com.example.universityR2DBC.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.*;
import org.springframework.data.annotation.*;

import java.util.Date;

/**
 * @author Grigoriy Zemlyanskiy
 * @version 1.0
 * class Group
 */

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
@Getter
@Setter
public abstract class Person {
    @Id
    @EqualsAndHashCode.Include()
    private Long id;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String lastName;

    @Column
    private Date dateBirth;

    @Column
   /* @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")*/
    private String gender;
}