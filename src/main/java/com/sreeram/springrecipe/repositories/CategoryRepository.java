package com.sreeram.springrecipe.repositories;

import com.sreeram.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {


    Optional<Category> findByDescription(String description);
}
