package org.valdesius.noteapp.service;

import org.valdesius.noteapp.rest.dto.CategoryDto;
import org.valdesius.noteapp.rest.dto.NoteDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Long id);

    CategoryDto createCategory(CategoryDto categoryDTO);

    CategoryDto updateCategory(Long id, CategoryDto categoryDTO);

    void deleteCategory(Long id);
}
