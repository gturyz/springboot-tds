package War.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import War.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findByLogin(String login);
}
