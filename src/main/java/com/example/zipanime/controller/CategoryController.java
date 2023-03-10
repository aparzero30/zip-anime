package com.example.zipanime.controller;


import com.example.zipanime.entity.Category;
import com.example.zipanime.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/categories")
    public List<Category> getCategory() throws IOException {
        return categoryService.getCategory();
    }





}
