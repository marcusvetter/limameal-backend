package de.marcusvetter.lima.repository;

import de.marcusvetter.lima.model.Article;
import de.marcusvetter.lima.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, String> {

}
