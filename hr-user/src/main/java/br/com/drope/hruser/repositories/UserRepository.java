package br.com.drope.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
