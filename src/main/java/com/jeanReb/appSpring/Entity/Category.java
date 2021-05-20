package com.jeanReb.appSpring.Entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_category;
	private String name;
	
	
	
	
	public Category() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", name=" + name + "]";
	}


	public Long getId_category() {
		return id_category;
	}


	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}

	

	
	
	
}
