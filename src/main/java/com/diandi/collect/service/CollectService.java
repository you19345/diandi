package com.diandi.collect.service;

import com.diandi.collect.entity.Collect;
import com.diandi.common.vo.D;

public interface CollectService {

    D insert(Collect collect);

    D deleteByCollectId(Integer id);

    D queryByCollectId(Integer id);






}
