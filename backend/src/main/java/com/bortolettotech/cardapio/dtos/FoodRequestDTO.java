package com.bortolettotech.cardapio.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record FoodRequestDTO(
        @NotBlank @NotNull String title,
        @NotBlank @NotNull String image,
        @NotBlank @NotNull Double price
    ) {
}
