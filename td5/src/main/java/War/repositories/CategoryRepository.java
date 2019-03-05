package War.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import War.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
