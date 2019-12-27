package com.acqio.service;

import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.models.PersonConversor;
import com.acqio.repository.PersonRepository;
import com.acqio.resource.PersonResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavePersonServiceImpl {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonConversor personConversor;

    public void savePerson(PersonResource personResource) throws PersonResourceException {

        try{
            Person person = personConversor.conversor(personResource);
            personRepository.saveAndFlush(person);
        }catch(Exception e){
            throw new PersonResourceException(e.getMessage());
        }

    }

}
