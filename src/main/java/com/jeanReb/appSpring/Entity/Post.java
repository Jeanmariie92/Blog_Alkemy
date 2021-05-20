package com.jeanReb.appSpring.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "post")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Post {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_post;
	private String title;
	private String content;
	private Date fecha = new Date();
	private String image;
	
	@ManyToOne(fetch = FetchType.LAZY)
   
	private Category category;
	
	@ManyToOne(fetch = FetchType.LAZY)
    
	private User user;

	public Post() {
		
	}

	public Long getId_post() {
		return id_post;
	}

	public void setId_post(Long id_post) {
		this.id_post = id_post;
	}

	public String getCategory() {
		return category.getName() ;
	}


	public String getUser() {
		return user.getEmail() ;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	


	
	
	
	
	
}
