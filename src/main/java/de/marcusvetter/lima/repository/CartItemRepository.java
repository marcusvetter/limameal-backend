package de.marcusvetter.lima.repository;

import de.marcusvetter.lima.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, String> {

}
