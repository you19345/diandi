package com.diandi.user.entity;

public class Comment {
    private Integer id;

    private Integer userId;

    private Integer newsId;

    private String retext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getRetext() {
        return retext;
    }

    public void setRetext(String retext) {
        this.retext = retext == null ? null : retext.trim();
    }
}