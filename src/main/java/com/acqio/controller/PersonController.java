package com.acqio.controller;

import com.acqio.exceptions.PersonNotFoundException;
import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import com.acqio.resource.PersonResource;
import com.acqio.service.FetchPersonByIdServiceImpl;
import com.acqio.service.FetchPersonServiceImpl;

import com.acqio.service.SavePersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private FetchPersonServiceImpl service_FindAll;

    @Autowired
    private SavePersonServiceImpl service_SavePerson;

    @Autowired
    private FetchPersonByIdServiceImpl service_FetchPersonById;

    @GetMapping(value = "person")
    public List<Person> fetchPerson() {
        return service_FindAll.fetchPerson();
    }

    @GetMapping(path = "person/id/{id}")
    public Person fetchPersonById(@PathVariable(name = "id", required = true) Long id) throws PersonNotFoundException {
        return service_FetchPersonById.fetchPersonById(id);
    }

    @PostMapping(path = "person/save")
    @Transactional
    public void savePerson(@RequestBody PersonResource personResource) throws PersonResourceException {
        service_SavePerson.savePerson(personResource);
    }


}
