package com.diandi.user.entity;

public class UserCollect {
    private Integer id;

    private Integer collectsNewsId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollectsNewsId() {
        return collectsNewsId;
    }

    public void setCollectsNewsId(Integer collectsNewsId) {
        this.collectsNewsId = collectsNewsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}