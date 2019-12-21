package com.acqio.service;

import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class fetchPersonServiceImpl {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> fetchPerson(){
        List<Person> list = personRepository.findAll();
        return list;
    }

}
