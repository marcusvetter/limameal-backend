package de.marcusvetter.lima;

import de.marcusvetter.lima.model.Article;
import de.marcusvetter.lima.model.Cart;
import de.marcusvetter.lima.model.CartItem;
import de.marcusvetter.lima.model.User;
import de.marcusvetter.lima.repository.ArticleRepository;
import de.marcusvetter.lima.repository.CartItemRepository;
import de.marcusvetter.lima.repository.CartRepository;
import de.marcusvetter.lima.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<Article> articles = new ArrayList<>();
        articles.add(Article.builder().name("Tomate").build());
        articles.add(Article.builder().name("Apfel").build());
        articles.add(Article.builder().name("Karotte").build());
        articles.add(Article.builder().name("Banane").build());

        List<Cart> carts = new ArrayList<>();
        carts.add(Cart.builder().name("Lebensmittel").build());

        User user = User.builder().name("Marcus").articles(articles).carts(carts).build();
        userRepository.save(user);

        CartItem cartItem = CartItem.builder().article(articles.get(0)).cart(carts.get(0)).build();
        cartItemRepository.save(cartItem);
    }
}
