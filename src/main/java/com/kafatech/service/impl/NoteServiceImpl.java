package com.kafatech.service.impl;

import com.kafatech.models.response.InfoMessage;
import com.kafatech.service.NoteService;
import com.kafatech.service.dto.NoteRecordDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Override
    public List<NoteRecordDTO> getAllNoteRecord(String nameAndSurname) {
        return null;
    }

    @Override
    public InfoMessage createNoteRecord(NoteRecordDTO noteRecordDTO) {
        return null;
    }

    @Override
    public InfoMessage deleteNoteRecord(Long noteId) {
        return null;
    }

    @Override
    public InfoMessage detailNoteRecord(Long noteId) {
        return null;
    }
}
