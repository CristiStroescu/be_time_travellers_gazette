package com.facultate.timetravellergazette.service.impl;

import com.facultate.timetravellergazette.model.dto.ArticleDto;
import com.facultate.timetravellergazette.model.entity.Article;
import com.facultate.timetravellergazette.model.mapper.ArticleMapper;
import com.facultate.timetravellergazette.repository.ArticleRepository;
import com.facultate.timetravellergazette.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {this.articleRepository = articleRepository;}

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(int id){
        return articleRepository.findArticleById(id);
    }
}
