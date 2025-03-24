package com.nandes.CalculadorAPI.service.service_impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandes.CalculadorAPI.domain.models.Food;
import com.nandes.CalculadorAPI.domain.repository.FoodRepository;
import com.nandes.CalculadorAPI.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food findById(int id) {
        return foodRepository.findById(id).orElseThrow(
            NoSuchElementException::new
        );
    }

    @Override
    public Food create(Food foodToCreate) {
        if(foodRepository.existsByName(foodToCreate.getName())){
            throw new IllegalArgumentException("This food already exists");
        }

        return foodRepository.save(foodToCreate);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

}
