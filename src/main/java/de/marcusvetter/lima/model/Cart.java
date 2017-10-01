package de.marcusvetter.lima.model;

import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue
    private String id;

    private String name;

}