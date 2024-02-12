package com.kafatech.controller;

import com.kafatech.models.response.InfoMessage;
import com.kafatech.service.NoteService;
import com.kafatech.service.dto.NoteRecordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NoteController {

    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/getAll")
    public ResponseEntity<List<NoteRecordDTO>> getAllNoteRecord(String nameAndSurname) {
        return ResponseEntity.ok(noteService.getAllNoteRecord(nameAndSurname));
    }

    @PostMapping("/createNote")
    public ResponseEntity<InfoMessage> createNoteRecord(NoteRecordDTO noteRecordDTO) {
        return ResponseEntity.ok(noteService.createNoteRecord(noteRecordDTO));
    }

    @DeleteMapping("/deleteNote/{noteId}")
    public ResponseEntity<InfoMessage> deleteNoteRecord(@PathVariable Long noteId) {
        return ResponseEntity.ok(noteService.deleteNoteRecord(noteId));
    }

    @GetMapping("/getNote/{noteId}")
    public ResponseEntity<InfoMessage> detailNoteRecord(@PathVariable Long noteId) {
        return ResponseEntity.ok(noteService.detailNoteRecord(noteId));
    }
}
