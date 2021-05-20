package com.jeanReb.appSpring.Repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import com.jeanReb.appSpring.Entity.Post;



@Repository
public interface PostRepository  extends CrudRepository<Post, Long>{

	@Query(
			value = "SELECT id_post, title, image, category_id_category, fecha FROM post ORDER BY fecha DESC ",
			nativeQuery = true
			)
	Iterable<?> searchOrderDate();
	
	@Query(
			value = "SELECT id_post, title, image, category_id_category, fecha FROM post WHERE title = ? ORDER BY fecha DESC ",
			nativeQuery = true
			)
	Iterable<?> searchOrderDate_title(@Param("title") String title);
	
	@Query(
			value = "SELECT id_post, title, image, category_id_category, fecha FROM post WHERE category_id_category = ? ORDER BY fecha DESC ",
			nativeQuery = true
			)
	Iterable<?> searchOrderDate_category(@Param("category") String category);
	
	@Query(
			value = "SELECT id_post, title, image, category_id_category, fecha FROM post WHERE title = ? and category_id_category = ? ORDER BY fecha DESC ",
			nativeQuery = true
			)
	Iterable<?> searchOrderDate_categoryAdnTitle(@Param("title") String title, @Param("category") String category);
	
}
