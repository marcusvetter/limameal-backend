package de.marcusvetter.lima.controller;

import de.marcusvetter.lima.model.Article;
import de.marcusvetter.lima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(RequestMappings.ARTICLES)
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping
    public List<Article> articles() {
        return articleService.getArticles();
    }

}
