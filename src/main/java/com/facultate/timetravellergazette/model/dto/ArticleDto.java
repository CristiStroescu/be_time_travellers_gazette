package com.facultate.timetravellergazette.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleDto {
    private int id;
    private String title;
    private String subtitle;
    private String article;
    private String imagePath1;
    private String imagePath2;
    private String imagePath3;
}
