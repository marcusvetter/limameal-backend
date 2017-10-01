package de.marcusvetter.lima.model;

import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue
    private String id;

    @ManyToOne
    private Article article;

    @ManyToOne
    private Cart cart;

}