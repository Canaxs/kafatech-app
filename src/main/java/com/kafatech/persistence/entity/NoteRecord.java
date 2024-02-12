package com.kafatech.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "noterecord")
@NoArgsConstructor
@AllArgsConstructor
public class NoteRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nameAndSurname;

    private String courseName;

    private String courseNote;
}
