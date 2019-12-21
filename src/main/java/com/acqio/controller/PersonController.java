package com.acqio.controller;

import com.acqio.exceptions.PersonNotFoundException;
import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import com.acqio.resource.PersonResource;
import com.acqio.service.fetchPersonByIdServiceImpl;
import com.acqio.service.fetchPersonServiceImpl;
import com.acqio.service.savePersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private fetchPersonServiceImpl service_findAll;

    @Autowired
    private savePersonServiceImpl service_savePerson;

    @Autowired
    private fetchPersonByIdServiceImpl service_fetchPersonById;

    @GetMapping(path = "/person")
    public List<Person> fetchPerson(){
        return service_findAll.fetchPerson();
    }

    @GetMapping(path = "/person/id/{id}")
    public Person fetchPersonById(@PathVariable(name = "id", required = true) Long idPerson) throws PersonNotFoundException {
        return service_fetchPersonById.fetchPersonById(idPerson);
    }

    @PostMapping(path = "/person/save")
    public void savePerson(@RequestBody PersonResource personResource) throws PersonResourceException {
        service_savePerson.savePerson(personResource);
    }


}
