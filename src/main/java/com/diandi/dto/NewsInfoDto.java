package com.diandi.dto;

import lombok.Data;

/**
 * @program: diandi
 * @description: 新闻详情
 * @author: You毒
 * @create: 2019-12-23 17:52
 **/
@Data
public class NewsInfoDto {
    private Integer newsId;
    private String content;
    private String pictureUrl;
    private Integer typeId;
    private String reText;
    private Integer userId;
}
