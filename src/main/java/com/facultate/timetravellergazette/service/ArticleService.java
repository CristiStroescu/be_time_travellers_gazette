package com.facultate.timetravellergazette.service;

import com.facultate.timetravellergazette.model.dto.ArticleDto;
import com.facultate.timetravellergazette.model.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getArticles();

    Article getArticleById(int id);
}
