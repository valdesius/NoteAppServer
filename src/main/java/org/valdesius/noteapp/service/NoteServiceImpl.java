package org.valdesius.noteapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.valdesius.noteapp.domain.Note;
import org.valdesius.noteapp.repository.NoteRepository;
import org.valdesius.noteapp.rest.dto.NoteDto;
import org.valdesius.noteapp.rest.mapper.NoteMapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private NoteMapper noteMapper;
    @Override
    public List<NoteDto> getAllNotes() {
        return noteRepository.findAll().stream()
                .map(noteMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public NoteDto getNoteById(Long id) {
        return noteRepository.findById(id)
                .map(noteMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Note not found"));
    }

    @Override
    public NoteDto createNote(NoteDto noteDTO) {
        Note note = noteMapper.toEntity(noteDTO);
        note.setCreatedAt(LocalDateTime.now());
        note.setUpdatedAt(LocalDateTime.now());
        note = noteRepository.save(note);
        return noteMapper.toDto(note);
    }

    @Override
    public NoteDto updateNote(Long id, NoteDto noteDTO) {
        Note note = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setTitle(noteDTO.getTitle());
        note.setContent(noteDTO.getContent());
        note.setUpdatedAt(LocalDateTime.now());
        note = noteRepository.save(note);
        return noteMapper.toDto(note);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
