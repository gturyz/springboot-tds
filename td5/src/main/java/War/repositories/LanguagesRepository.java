package War.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import War.entity.History;
import War.entity.Languages;

public interface LanguagesRepository extends JpaRepository<Languages, Integer> {
	
}
