package org.valdesius.noteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.valdesius.noteapp.domain.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
