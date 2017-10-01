package de.marcusvetter.lima.controller;

import de.marcusvetter.lima.model.Article;
import de.marcusvetter.lima.model.User;
import de.marcusvetter.lima.repository.UserRepository;
import de.marcusvetter.lima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(RequestMappings.ARTICLES)
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping
    public List<Article> articles() {
        User user = userRepository.findOne("1");
        return user.getArticles();
    }

}
