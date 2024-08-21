package org.valdesius.noteapp.rest.mapper;

import org.springframework.stereotype.Component;
import org.valdesius.noteapp.domain.Note;
import org.valdesius.noteapp.rest.dto.NoteDto;

@Component
public class NoteMapper {

    public NoteDto toDto(Note note) {
        NoteDto noteDTO = new NoteDto();
        noteDTO.setNote_id(note.getId());
        noteDTO.setTitle(note.getTitle());
        noteDTO.setContent(note.getContent());
        noteDTO.setCreatedAt(note.getCreatedAt());
        noteDTO.setUpdatedAt(note.getUpdatedAt());
        noteDTO.setCategoryId(note.getCategory() != null ? note.getCategory().getId() : null);
        return noteDTO;
    }

    public Note toEntity(NoteDto noteDTO) {
        Note note = new Note();
        note.setId(noteDTO.getNote_id());
        note.setTitle(noteDTO.getTitle());
        note.setContent(noteDTO.getContent());
        note.setCreatedAt(noteDTO.getCreatedAt());
        note.setUpdatedAt(noteDTO.getUpdatedAt());
        // Здесь можно добавить логику для установки категории и тегов
        return note;
    }
}