package com.facultate.timetravellergazette.model.mapper;

import com.facultate.timetravellergazette.model.dto.ArticleDto;
import com.facultate.timetravellergazette.model.entity.Article;

public class ArticleMapper {
    public static ArticleDto toArticleDto(Article article)
    {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(article.getId());
        articleDto.setTitle(article.getTitle());
        articleDto.setSubtitle(article.getSubtitle());
        articleDto.setArticle(article.getArticle());
        articleDto.setImagePath1(article.getImagePath1());
        articleDto.setImagePath2(article.getImagePath2());
        articleDto.setImagePath3(article.getImagePath3());

        return articleDto;
    }
}
