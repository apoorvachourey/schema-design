package com.example.schemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class BirthDate extends BaseModel{
    String date;
    @OneToMany(mappedBy = "dob")
    List<User> users;
}
