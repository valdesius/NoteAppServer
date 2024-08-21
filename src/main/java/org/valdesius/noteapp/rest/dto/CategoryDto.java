package org.valdesius.noteapp.rest.dto;

import lombok.Data;

import java.util.List;
@Data
public class CategoryDto {
    private Long category_id;
    private String name;
    private List<Long> noteIds;
}
