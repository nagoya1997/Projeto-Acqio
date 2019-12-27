package com.acqio.service;

import com.acqio.exceptions.CityResourceException;
import com.acqio.models.City;
import com.acqio.models.CityConversor;
import com.acqio.repository.CityRepository;
import com.acqio.resource.CityResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCityServiceImpl {


    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityConversor cityConversor;

    public void saveCity(CityResource cityResource) throws CityResourceException {

        try{
            City city = cityConversor.conversor(cityResource);
            cityRepository.saveAndFlush(city);
        }catch (Exception e){
            throw new CityResourceException(e.getMessage());
        }

    }

}
