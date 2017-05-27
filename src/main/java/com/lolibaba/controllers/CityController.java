package com.lolibaba.controllers;

import com.lolibaba.models.City;
import com.lolibaba.services.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by renruiquan on 2017/5/27.
 */
@RestController
public class CityController {

    @Autowired
    private ICityService cityService;

    @RequestMapping(value = "/")
    public String Index() {
        return "Hello World";
    }

    @RequestMapping(value = "/getCityList")
    public List<City> getCityList() {
        return cityService.getCityList();
    }
}
