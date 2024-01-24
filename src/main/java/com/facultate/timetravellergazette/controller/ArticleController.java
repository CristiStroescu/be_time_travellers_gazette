package com.facultate.timetravellergazette.controller;

import com.facultate.timetravellergazette.model.dto.ArticleDto;
import com.facultate.timetravellergazette.model.entity.Article;
import com.facultate.timetravellergazette.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {this.articleService = articleService;}

    @GetMapping()
    public ResponseEntity<List<Article>> getAllArticles() {
        return new ResponseEntity<>(articleService.getArticles(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable Integer id){
        return new ResponseEntity<>(articleService.getArticleById(id), HttpStatus.OK);
    }
}
