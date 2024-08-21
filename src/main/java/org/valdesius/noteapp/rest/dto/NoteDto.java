package org.valdesius.noteapp.rest.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class NoteDto {
    private Long note_id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long categoryId;
}
