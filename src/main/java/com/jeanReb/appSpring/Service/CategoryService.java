package com.jeanReb.appSpring.Service;



import org.springframework.stereotype.Service;

import com.jeanReb.appSpring.Entity.Category;

@Service
public interface CategoryService {

	   public Iterable<Category> getAllCategories() throws Exception;
		
	   public Category getById(Long id) throws Exception ;
	   
	   public Category updateCategory(Category category) throws Exception;
	     
	   public boolean deleteCategory(Long id) throws Exception;
	   
	   public Category save(Category category) throws Exception;
}
