package de.marcusvetter.lima.repository;

import de.marcusvetter.lima.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
