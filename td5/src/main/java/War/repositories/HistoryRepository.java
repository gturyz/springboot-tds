package War.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import War.entity.History;

public interface HistoryRepository extends JpaRepository<History, Integer> {
	
}
