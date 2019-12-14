package com.diandi.user.entity;

public class UserLike {
    private Integer id;

    private String likesNews;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLikesNews() {
        return likesNews;
    }

    public void setLikesNews(String likesNews) {
        this.likesNews = likesNews == null ? null : likesNews.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}