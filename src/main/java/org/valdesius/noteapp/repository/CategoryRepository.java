package org.valdesius.noteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.valdesius.noteapp.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
