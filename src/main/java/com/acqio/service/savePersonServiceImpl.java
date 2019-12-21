package com.acqio.service;

import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import com.acqio.resource.PersonResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class savePersonServiceImpl {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonConversor service_personConversor;

    public void savePerson(PersonResource personResource) throws PersonResourceException {

        try{

            Person p = service_personConversor.conversor(personResource);
            personRepository.saveAndFlush(p);
        }catch(Exception e){
            throw new PersonResourceException(e.getMessage());
        }

    }

}
