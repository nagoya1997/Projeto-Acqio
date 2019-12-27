package com.acqio.models;


import com.acqio.exceptions.CityResourceException;
import com.acqio.exceptions.PersonResourceException;
import com.acqio.resource.CityResource;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class CityConversor {

    public City conversor(CityResource cityResource) throws CityResourceException {

        if (checkCityName(cityResource.getName()))
            throw new CityResourceException("Falha ao converter o resource em entidade! (Nome)");

        City city = new City();
        city.setId(cityResource.getId());
        city.setName(cityResource.getName());
        city.setState(cityResource.getState());

        return city;

    }

    private boolean checkCityName(String name){
        return Pattern.compile("[0-9]").matcher(name).find();
    }


}
