package de.marcusvetter.lima.repository;

import de.marcusvetter.lima.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {

    List<Article> findByName(String name);

}
