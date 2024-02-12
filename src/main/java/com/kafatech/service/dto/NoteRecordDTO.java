package com.kafatech.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoteRecordDTO {
    private Long Id;
    private String nameAndSurname;
    private String courseName;
    private String courseNote;
}
