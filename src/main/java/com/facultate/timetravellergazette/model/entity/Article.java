package com.facultate.timetravellergazette.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String subtitle;
    private String article;

    @Column(name = "image_path1")
    private String imagePath1;
    @Column(name = "image_path2")
    private String imagePath2;
    @Column(name = "image_path3")
    private String imagePath3;
}
