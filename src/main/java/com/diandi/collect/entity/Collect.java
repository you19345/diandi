package com.diandi.collect.entity;


public class Collect {
    private Integer id;
    private Integer collects_news_id;
    private Integer user_id;
    private String uc_time;

    public Collect() {
    }

    public Collect(Integer id, Integer collects_news_id, Integer user_id, String uc_time) {
        this.id = id;
        this.collects_news_id = collects_news_id;
        this.user_id = user_id;
        this.uc_time = uc_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollects_news_id() {
        return collects_news_id;
    }

    public void setCollects_news_id(Integer collects_news_id) {
        this.collects_news_id = collects_news_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUc_time() {
        return uc_time;
    }

    public void setUc_time(String uc_time) {
        this.uc_time = uc_time;
    }
}
