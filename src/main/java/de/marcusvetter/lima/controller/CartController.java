package de.marcusvetter.lima.controller;

import de.marcusvetter.lima.model.Cart;
import de.marcusvetter.lima.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(RequestMappings.CART)
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping
    public List<Cart> getCarts() {
        return cartService.getCarts();
    }

}
