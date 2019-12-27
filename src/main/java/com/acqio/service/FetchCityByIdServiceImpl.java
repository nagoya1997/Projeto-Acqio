package com.acqio.service;

import com.acqio.exceptions.CityNotFoundException;

import com.acqio.models.City;
import com.acqio.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FetchCityByIdServiceImpl {

    @Autowired
    private CityRepository cityRepository;

    public City fetchCityById(Long id) throws CityNotFoundException {
        Optional<City> result = cityRepository.findById(id);

        City city = null;

        if(!result.isPresent()){
            throw new CityNotFoundException("Cidade não encontrada");
        }else{
            city = result.get();
        }

        return city;
    }


}
