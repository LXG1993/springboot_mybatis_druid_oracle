package com.lolibaba.services.impl;

import com.lolibaba.daos.ICityDao;
import com.lolibaba.models.City;
import com.lolibaba.services.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by renruiquan on 2017/5/27.
 */

@Service("cityService")
public class CityServiceImpl implements ICityService {

    @Autowired
    private ICityDao cityDao;

    /**
     * 返回城市列表
     *
     * @return
     */
    @Override
    public List<City> getCityList() {
        return cityDao.getCityList();
    }
}
