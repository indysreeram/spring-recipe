package com.sreeram.springrecipe.controllers;

import com.sreeram.springrecipe.domain.Category;
import com.sreeram.springrecipe.domain.UnitOfMeasure;
import com.sreeram.springrecipe.repositories.CategoryRepository;
import com.sreeram.springrecipe.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Value("${spring.message}")
    private String message;

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat :id "+categoryOptional.get().getId());
        System.out.println("UOM :id "+categoryOptional.get().getId());

        System.out.println("I am in the index controller!!!");
         return "index";
    }

    @RequestMapping({"/hello"})
    public String hello(Model model){
        model.addAttribute("message",message);
        return "hello";
    }


}
