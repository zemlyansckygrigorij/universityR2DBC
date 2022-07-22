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
@Table(name = "teacher")
public class Teacher extends Person {

    @Column
    private String category;

    @Override
    public String toString() {
        return "teacher {" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", dateBirthday=" + this.getDateBirth() +
                ", Category='" + this.getCategory() + '\'' +

                ", gender=" + this.getGender() +

                '}';
    }
}