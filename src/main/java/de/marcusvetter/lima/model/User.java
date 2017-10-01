package de.marcusvetter.lima.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cart> carts;

}