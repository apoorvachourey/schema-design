package com.example.schemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Student extends BaseModel {
    @OneToOne
    private User user;
    @ManyToMany(mappedBy = "students")
    private List<Batch> batches;
}
