package com.nandes.CalculadorAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandes.CalculadorAPI.domain.models.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{
    boolean existsByName(String name);
}
