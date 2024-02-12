package com.kafatech.service.dto;

import lombok.Data;

@Data
public class NoteRecordDTO {
    private Long Id;
    private String nameAndSurname;
    private String courseName;
    private String courseNote;
}
