package com.diandi.user.entity;

public class UserTranspond {
    private Integer id;

    private String transpondNews;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTranspondNews() {
        return transpondNews;
    }

    public void setTranspondNews(String transpondNews) {
        this.transpondNews = transpondNews == null ? null : transpondNews.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}