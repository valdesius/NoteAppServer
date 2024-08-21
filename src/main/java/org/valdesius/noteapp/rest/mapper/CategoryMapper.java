package org.valdesius.noteapp.rest.mapper;

import org.springframework.stereotype.Component;
import org.valdesius.noteapp.domain.Category;
import org.valdesius.noteapp.rest.dto.CategoryDto;

import java.util.stream.Collectors;
import org.valdesius.noteapp.domain.Note;
import org.valdesius.noteapp.rest.dto.NoteDto;

@Component
public class CategoryMapper {

    public CategoryDto toDto(Category category) {
        CategoryDto categoryDTO = new CategoryDto();
        categoryDTO.setCategory_id(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setNoteIds(category.getNotes().stream().map(Note::getId).collect(Collectors.toList()));
        return categoryDTO;
    }

    public Category toEntity(CategoryDto categoryDTO) {
        Category category = new Category();
        category.setId(categoryDTO.getCategory_id());
        category.setName(categoryDTO.getName());
        // Здесь можно добавить логику для установки заметок
        return category;
    }
}