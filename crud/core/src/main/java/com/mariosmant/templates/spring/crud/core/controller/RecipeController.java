package com.mariosmant.templates.spring.crud.core.controller;

import com.mariosmant.templates.spring.crud.core.controller.common.AbstractApiVersion1Controller;
import com.mariosmant.templates.spring.crud.core.controller.dto.RecipeRequestDto;
import com.mariosmant.templates.spring.crud.core.controller.dto.RecipeResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController extends AbstractApiVersion1Controller {

    @GetMapping
    public List<RecipeResponseDto> getAllRecipes() {
        // TODO Add Service layer.
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public RecipeResponseDto getRecipeById(@PathVariable Long id) {
        // TODO Add Service layer.
        return new RecipeResponseDto();
    }

    @PostMapping
    public RecipeResponseDto createRecipe(@RequestBody RecipeRequestDto recipe) {
        // TODO Add Service layer.
        return new RecipeResponseDto();
    }

    @PutMapping("/{id}")
    public RecipeResponseDto updateRecipe(@PathVariable Long id, @RequestBody RecipeRequestDto recipe) {
        // TODO Add Service layer.
        return new RecipeResponseDto();
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        // TODO Add Service layer.
        // Implementation to delete a specific recipe by ID
    }
}
