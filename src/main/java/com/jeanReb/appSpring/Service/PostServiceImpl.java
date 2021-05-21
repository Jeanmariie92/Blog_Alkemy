package com.jeanReb.appSpring.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanReb.appSpring.DTO.postDTO;
import com.jeanReb.appSpring.Entity.Category;
import com.jeanReb.appSpring.Entity.Post;
import com.jeanReb.appSpring.Entity.User;
import com.jeanReb.appSpring.Repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	
	@Autowired
	private PostRepository repository;
	
	
	@Override
	@Transactional
	public Iterable<?> getAll() throws Exception{
		try {
			Iterable<?> posts = repository.findAll();
			return posts;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		}
	
	
	
	
	
	@Override
	@Transactional
	public Iterable<?> getAllPost() throws Exception{
		try {
			Iterable<?> posts = repository.searchOrderDate();
			return posts;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		}
	
	@Override
	public Iterable<?> getAllPostByCategory(String category) throws Exception {
		try {
			Iterable<?> posts = repository.searchOrderDate_category(category);
			return posts;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	@Override
	@Transactional
	public Iterable<?> getAllPostByTitle(String title) throws Exception{
		try {
			Iterable<?> posts = repository.searchOrderDate_title(title);
			return posts;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		}

	@Override
	@Transactional

	public Post getById(Long id) throws Exception {
		try {

			Optional<Post> postOptional = repository.findById(id);
			return postOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional

	public Post updatePost(Long id,Post post) throws Exception {
		try {
       
	 
		
       return repository.save(post);
       
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}
	
	

	@Override
	@Transactional

	public boolean deletePost(Long id) throws Exception {
		try {	
			if(repository.existsById(id)) {
				
				Post post = getById(id);
				repository.delete(post);
				return true;
				
			}
			
			else {
				throw new Exception();		
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());			
		}
		
	}

	@Override
	@Transactional

	public Post save(Post post) throws Exception {
		
		Post post_new =repository.save(post);
		return post_new;
	}

	

}
