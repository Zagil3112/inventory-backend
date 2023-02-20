package com.example.inventory_gradle.response;


import com.example.inventory_gradle.model.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
