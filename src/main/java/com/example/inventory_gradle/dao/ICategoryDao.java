package com.example.inventory_gradle.dao;

import com.example.inventory_gradle.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
