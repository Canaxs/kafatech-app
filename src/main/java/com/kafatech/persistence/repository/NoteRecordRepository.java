package com.kafatech.persistence.repository;

import com.kafatech.persistence.entity.NoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRecordRepository extends JpaRepository<NoteRecord, Long> {
}
