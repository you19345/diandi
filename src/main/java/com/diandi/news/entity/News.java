package com.diandi.news.entity;

import lombok.Data;

@Data
public class News {
    private Integer id;

    private String pictureUrl;

    private Integer typeId;

    private String content;

    private Integer userId;
}