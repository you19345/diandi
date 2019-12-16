package com.diandi.dto;

import lombok.Data;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-15 11:03
 **/
@Data
public class NewsQueryDto {
    private int id;
    private int type;
    private String content;
    private int page;
    private int size;

}
