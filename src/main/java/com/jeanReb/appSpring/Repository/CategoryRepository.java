package com.jeanReb.appSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeanReb.appSpring.Entity.Category;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
