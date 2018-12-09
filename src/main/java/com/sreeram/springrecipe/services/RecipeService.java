package com.sreeram.springrecipe.services;

import com.sreeram.springrecipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
