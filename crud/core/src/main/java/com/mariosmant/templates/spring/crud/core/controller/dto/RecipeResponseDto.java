package com.mariosmant.templates.spring.crud.core.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RecipeResponseDto {
    private String name;
    private String description;
}
