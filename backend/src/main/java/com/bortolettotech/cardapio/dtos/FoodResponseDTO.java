package com.bortolettotech.cardapio.dtos;

import com.bortolettotech.cardapio.entities.FoodEntity;

import java.util.UUID;

public record FoodResponseDTO(
        UUID id,
        String title,
        String image,
        Double price
) {

    public FoodResponseDTO(FoodEntity food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
