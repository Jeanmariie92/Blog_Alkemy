package com.jeanReb.appSpring.Service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanReb.appSpring.Entity.Category;
import com.jeanReb.appSpring.Repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repository;

	
	@Override
	@Transactional
	public Iterable<Category> getAllCategories() throws Exception {

		try {
			Iterable<Category> categories = repository.findAll();
			return categories;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	
	@Override
	@Transactional
	public Category getById(Long id) throws Exception {

		try {
           Optional<Category>  categoryOptional = repository.findById(id);
           return categoryOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional
	public Category updateCategory(Category category) throws Exception {
		
		try {

			Category categoryOptional = getById(category.getId_category());
			Category categoryUpdate= save(categoryOptional);
			return categoryUpdate;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

	@Override
	@Transactional
	public boolean deleteCategory(Long id) throws Exception {
		try {
			
			if(repository.existsById(id)) {
				
			repository.deleteById(id);
			return true;
			
			}else {	
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	

	@Override
	@Transactional
	public Category save(Category category) throws Exception {
		try {

			category = repository.save(category);
			return category;
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

}
