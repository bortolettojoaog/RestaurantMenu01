package com.bortolettotech.cardapio.repositories;

import com.bortolettotech.cardapio.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
