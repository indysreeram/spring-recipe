package com.sreeram.springrecipe.repositories;

import com.sreeram.springrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
