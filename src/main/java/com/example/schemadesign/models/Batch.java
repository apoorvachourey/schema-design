package com.example.schemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    private String name;

    @ManyToMany
    private List<Student> students;
}
