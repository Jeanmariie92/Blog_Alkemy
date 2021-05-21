package com.jeanReb.appSpring.Contoller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




import com.jeanReb.appSpring.Entity.Post;
import com.jeanReb.appSpring.Repository.PostRepository;
import com.jeanReb.appSpring.Service.CategoryServiceImpl;
import com.jeanReb.appSpring.Service.PostService;


@RestController
@CrossOrigin(origins = "*")
public class Controller {

	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private PostRepository repository;

	public Controller() {
		
	}

	@GetMapping("blog/posts/all")
	public ResponseEntity<?> getAll(){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(postService.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	@GetMapping("blog/posts")
	public ResponseEntity<?> getAllPosts(){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPost());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	@GetMapping("blog/posts/title")
	public ResponseEntity<?> getAllPostsByTitle(@RequestParam String title){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPostByTitle(title));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	@GetMapping("blog/posts/category")
	public ResponseEntity<?> getAllPostsByCategory(@RequestParam String category){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPostByCategory(category));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	@GetMapping("blog/posts/id")
	public ResponseEntity<?> getAllPostsById(@RequestParam Long id){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(postService.getById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	
	  @PutMapping("blog/posts/update") public ResponseEntity<?>
	  updatePost(@RequestParam Long id,@RequestBody Post post){
	  
	  try { 
		  return
	  ResponseEntity.status(HttpStatus.OK).body(postService.updatePost(id, post));
	  } catch (Exception e) { return ResponseEntity.status(HttpStatus.NOT_FOUND).
	  body("{\"error\":\"Error por favor intente mas tarde.\"}"); }
	  
	  }
	 
	@DeleteMapping("blog/posts/delete/{id}")
	public ResponseEntity<?> deletePost(@PathVariable Long id){
		
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(postService.deletePost(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	
	
	
	@GetMapping("blog/categorias")
	public ResponseEntity<?> getAllCategories(){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(categoryService.getAllCategories());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}

	
	
	
}
