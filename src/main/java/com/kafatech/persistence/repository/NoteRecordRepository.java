package com.kafatech.persistence.repository;

import com.kafatech.persistence.entity.NoteRecord;
import com.kafatech.service.dto.NoteRecordDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRecordRepository extends JpaRepository<NoteRecord, Long> {

    @Query("SELECT "
        + "new com.kafatech.service.dto.NoteRecordDTO("
        + "n.Id,"
        + "n.nameAndSurname,"
        + "n.courseName,"
        + "n.courseNote)"
        + "FROM NoteRecord n "
        + "WHERE n.nameAndSurname = :nameAndSurname")
    List<NoteRecordDTO> getAllNameAndSurname(@Param("nameAndSurname") String nameAndSurname);

    @Query("SELECT "
            + "new com.kafatech.service.dto.NoteRecordDTO("
            + "n.Id,"
            + "n.nameAndSurname,"
            + "n.courseName,"
            + "n.courseNote)"
            + "FROM NoteRecord n ")
    List<NoteRecordDTO> getAll();

    @Query("SELECT "
            + "new com.kafatech.service.dto.NoteRecordDTO("
            + "n.Id,"
            + "n.nameAndSurname,"
            + "n.courseName,"
            + "n.courseNote)"
            + "FROM NoteRecord n "
            + "WHERE n.Id = :noteId")
    NoteRecordDTO getDetailNote(@Param("noteId") Long noteId);
}
