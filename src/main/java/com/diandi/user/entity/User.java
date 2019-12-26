package com.diandi.user.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String icon;

    private Boolean gender;

    private String tel;

    private Date birthday;

    private String address;

    private String signature;

}