package de.marcusvetter.lima.repository;

import de.marcusvetter.lima.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {

}
