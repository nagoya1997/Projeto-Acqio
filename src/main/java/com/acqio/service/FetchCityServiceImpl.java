package com.acqio.service;

import com.acqio.models.City;
import com.acqio.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FetchCityServiceImpl {

    @Autowired
    private CityRepository cityRepository;

    public List<City> fetchCity(){
        List<City> list = cityRepository.findAll();
        return list;
    }

}
