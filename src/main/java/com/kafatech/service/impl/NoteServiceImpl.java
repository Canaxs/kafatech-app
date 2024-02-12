package com.kafatech.service.impl;

import com.kafatech.common.exception.NoteException;
import com.kafatech.models.response.InfoMessage;
import com.kafatech.persistence.entity.NoteRecord;
import com.kafatech.persistence.repository.NoteRecordRepository;
import com.kafatech.service.NoteService;
import com.kafatech.service.dto.NoteRecordDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private NoteRecordRepository noteRecordRepository;

    public NoteServiceImpl(NoteRecordRepository noteRecordRepository) {
        this.noteRecordRepository = noteRecordRepository;
    }

    @Override
    public List<NoteRecordDTO> getAllNoteRecord(String nameAndSurname) {
        List<NoteRecordDTO> noteRecordDTOS = new ArrayList<>();
        if(nameAndSurname.isEmpty()) {
            noteRecordDTOS = noteRecordRepository.getAll();
        }
        else {
            noteRecordDTOS = noteRecordRepository.getAllNameAndSurname(nameAndSurname);
        }
        return noteRecordDTOS;
    }

    @Override
    public InfoMessage createNoteRecord(NoteRecordDTO noteRecordDTO) {
        System.out.println(noteRecordDTO.getCourseNote());
        try {
            noteRecordRepository.save(NoteRecord.builder()
                    .nameAndSurname(noteRecordDTO.getNameAndSurname())
                    .courseNote(noteRecordDTO.getCourseNote())
                    .courseName(noteRecordDTO.getCourseName())
                    .build());
        }
        catch (Exception e) {
            throw new NoteException();
        }
        return InfoMessage.builder().message("Successfully created").build();
    }

    @Override
    public InfoMessage deleteNoteRecord(Long noteId) {
        try {
            noteRecordRepository.delete(noteRecordRepository.findById(noteId).get());
        }
        catch (Exception e) {
            throw new NoteException();
        }
        return InfoMessage.builder().message("Successfully deleted").build();
    }

    @Override
    public NoteRecordDTO detailNoteRecord(Long noteId) {
        return noteRecordRepository.getDetailNote(noteId);
    }
}
