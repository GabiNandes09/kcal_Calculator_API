package com.nandes.CalculadorAPI.service;

import java.util.List;

import com.nandes.CalculadorAPI.domain.models.Food;


public interface FoodService {
    Food findById(int id);
    Food create(Food foodToCreate);
    List<Food> findAll();
}
