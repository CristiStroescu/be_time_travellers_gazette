package com.facultate.timetravellergazette.repository;

import com.facultate.timetravellergazette.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Article findArticleById(int id);
}
