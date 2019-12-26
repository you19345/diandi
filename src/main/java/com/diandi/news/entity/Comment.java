package com.diandi.news.entity;

import lombok.Data;

@Data
public class Comment {
    private Integer id;

    private Integer userId;

    private Integer newsId;

    private String retext;
}