package com.diandi.collect.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CollectQuery {

    private Integer id;
    private String content;
    private String picture_url;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date uc_time;

    public CollectQuery() {
    }

    public CollectQuery(Integer id, String content, String picture_url, Date uc_time) {
        this.id = id;
        this.content = content;
        this.picture_url = picture_url;
        this.uc_time = uc_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public Date getUc_time() {
        return uc_time;
    }

    public void setUc_time(Date uc_time) {
        this.uc_time = uc_time;
    }
}
