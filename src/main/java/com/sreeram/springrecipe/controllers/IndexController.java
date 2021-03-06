package com.sreeram.springrecipe.controllers;

import com.sreeram.springrecipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;
//
//    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//        this.categoryRepository = categoryRepository;
//        this.unitOfMeasureRepository = unitOfMeasureRepository;
//    }

   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Value("${spring.message}")
    private String message;

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){

//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println("Cat :id "+categoryOptional.get().getId());
//        System.out.println("UOM :id "+categoryOptional.get().getId());

        model.addAttribute("recipes",recipeService.getRecipes());

        log.debug("I am in the index controller!!!");

        System.out.println("I am in the index controller!!!");
        return "index";
    }

    @RequestMapping({"/hello"})
    public String hello(Model model){
        log.debug("hello hello!!!");
        model.addAttribute("message",message);
        return "hello";
    }


}
