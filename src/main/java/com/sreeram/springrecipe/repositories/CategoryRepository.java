package com.sreeram.springrecipe.repositories;

import com.sreeram.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
