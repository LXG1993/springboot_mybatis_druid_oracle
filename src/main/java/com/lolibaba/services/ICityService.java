package com.lolibaba.services;

import com.lolibaba.models.City;

import java.util.List;

/**
 * Created by renruiquan on 2017/5/27.
 */
public interface ICityService {

    /**
     * 获取城市列表
     *
     * @return
     */
    List<City> getCityList();
}
