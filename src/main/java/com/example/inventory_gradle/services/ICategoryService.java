package com.example.inventory_gradle.services;

import com.example.inventory_gradle.model.Category;
import com.example.inventory_gradle.response.CategoryResponseRest;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
	public ResponseEntity<CategoryResponseRest> deleteById(Long id);

}
