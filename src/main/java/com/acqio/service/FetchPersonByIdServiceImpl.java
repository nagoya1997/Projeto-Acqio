package com.acqio.service;

import com.acqio.exceptions.PersonNotFoundException;
import com.acqio.models.Person;
import com.acqio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FetchPersonByIdServiceImpl {

    @Autowired
    private PersonRepository personRepository;

    public Person fetchPersonById(Long id) throws PersonNotFoundException {
        Optional<Person> result = personRepository.findById(id);

        Person person = null;

        if(!result.isPresent()){
            throw  new PersonNotFoundException("Pessoa não encontrada");
        }else{
            person = result.get();
        }

        return person;
    }


}
