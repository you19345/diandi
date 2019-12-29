package com.diandi.collect.service.impl;

import com.diandi.collect.dao.CollectDao;
import com.diandi.collect.entity.Collect;
import com.diandi.collect.service.CollectService;
import com.diandi.common.vo.D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectServiceImpl implements CollectService {

  @Autowired
  private CollectDao collectDao;

    @Override
    public D insert(Collect collect) {
        if (collectDao.insert(collect)>0) {
            return D.OK();
        }
        return D.fail();
    }


    @Override
    public D deleteByCollectId(Integer id) {

        if (collectDao.deleteByCollectId(id)>0) {

            return D.OK();
        }

        return D.fail();
    }


    @Override
    public D queryByCollectId(Integer id) {

      return D.OK(collectDao.queryByCollectId(id));

    }




}
