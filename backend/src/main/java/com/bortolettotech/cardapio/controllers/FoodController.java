package com.bortolettotech.cardapio.controllers;

import com.bortolettotech.cardapio.dtos.FoodRequestDTO;
import com.bortolettotech.cardapio.dtos.FoodResponseDTO;
import com.bortolettotech.cardapio.entities.FoodEntity;
import com.bortolettotech.cardapio.repositories.FoodRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public ResponseEntity<String> saveFood(@RequestBody FoodRequestDTO data) {
        FoodEntity foodData = new FoodEntity(data);
        repository.save(foodData);
        return ResponseEntity.ok().build();
    }
}
