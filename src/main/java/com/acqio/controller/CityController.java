package com.acqio.controller;

import com.acqio.exceptions.CityNotFoundException;
import com.acqio.exceptions.CityResourceException;
import com.acqio.models.City;
import com.acqio.repository.CityRepository;
import com.acqio.resource.CityResource;
import com.acqio.service.FetchCityByIdServiceImpl;
import com.acqio.service.FetchCityServiceImpl;
import com.acqio.service.SaveCityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private SaveCityServiceImpl service_SaveCity;

    @Autowired
    private FetchCityByIdServiceImpl service_FetchCityById;

    @Autowired
    private FetchCityServiceImpl service_FindAll;

    @PostMapping(path = "city/save")
    @Transactional
    public void saveCity(@RequestBody CityResource cityResource) throws CityResourceException {
        service_SaveCity.saveCity(cityResource);
    }

    @GetMapping(value = "city")
    public List<City> fetchCity() {
        return service_FindAll.fetchCity();
    }

    @GetMapping(path = "city/id/{id}")
    public City fetchCityById(@PathVariable(name = "id", required = true) Long id) throws CityNotFoundException {
        return service_FetchCityById.fetchCityById(id);
    }


}
