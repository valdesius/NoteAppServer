package org.valdesius.noteapp.service;

import org.valdesius.noteapp.rest.dto.NoteDto;

import java.util.List;

public interface NoteService {
    List<NoteDto> getAllNotes();

    NoteDto getNoteById(Long id);

    NoteDto createNote(NoteDto noteDTO);

    NoteDto updateNote(Long id, NoteDto noteDTO);

    void deleteNote(Long id);
}
