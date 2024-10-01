package com.bortolettotech.cardapio.repositories;

import com.bortolettotech.cardapio.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
