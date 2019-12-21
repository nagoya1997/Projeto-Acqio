package com.acqio.service;

import com.acqio.exceptions.PersonNotFoundException;
import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class fetchPersonByIdServiceImpl {

    @Autowired
    private PersonRepository personRepository;

    public Person fetchPersonById(Long id) throws PersonNotFoundException {
        Optional<Person> p = personRepository.findById(id);

        Person person = null;

        if(!p.isPresent()){
            throw  new PersonNotFoundException("Pessoa não encontrada");
        }else{
            person = p.get();
        }

        return person;
    }


}
