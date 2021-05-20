package com.jeanReb.appSpring.Service;

import org.springframework.stereotype.Service;


import com.jeanReb.appSpring.Entity.Post;

@Service
public interface PostService {

	  public Iterable<?> getAllPost() throws Exception;
	  
	  public Iterable<?> getAllPostByTitle(String title) throws Exception;
	  
	  public Iterable<?> getAllPostByCategory(String category) throws Exception;
	
	   public Post getById(Long id) throws Exception ;
	   
	   public Post updatePost(Long id,Post post) throws Exception;
	     
	   public boolean deletePost(Long id) throws Exception;
	   
	   public Post save(Post post) throws Exception;
	   
	   
	   
	  
}
