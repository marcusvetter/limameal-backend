package de.marcusvetter.lima;

import de.marcusvetter.lima.model.Article;
import de.marcusvetter.lima.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Article a = Article.builder().name("Tomate").build();
        Article b = Article.builder().name("Apfel").build();
        Article c = Article.builder().name("Karotte").build();
        Article d = Article.builder().name("Banane").build();
        Stream.of(a, b, c, d).forEach(articleRepository::save);
    }
}
