package com.diandi.collect.dao;


import com.diandi.collect.entity.Collect;
import com.diandi.collect.entity.CollectQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangmm
 */
@Repository
public interface CollectDao {

    //收藏
    int insert(Collect collect);

    //取消收藏
    int deleteByCollectId(Integer id);

    //根据id查询文章
    List<CollectQuery> queryByCollectId(Integer id);


}
