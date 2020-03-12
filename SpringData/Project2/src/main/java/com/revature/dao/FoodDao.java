package com.revature.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Food;

public interface FoodDao extends JpaRepository<Food, Integer>{
	
	public Food findByFoodId(Integer foodId);
	
	public List<Food> findAll();

}