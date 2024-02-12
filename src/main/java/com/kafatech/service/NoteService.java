package com.kafatech.service;

import com.kafatech.models.response.InfoMessage;
import com.kafatech.service.dto.NoteRecordDTO;

import java.util.List;

public interface NoteService {
    List<NoteRecordDTO> getAllNoteRecord(String nameAndSurname);

    InfoMessage createNoteRecord(NoteRecordDTO noteRecordDTO);
    InfoMessage deleteNoteRecord(Long noteId);

    NoteRecordDTO detailNoteRecord(Long noteId);

}
