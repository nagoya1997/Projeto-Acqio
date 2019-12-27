package com.acqio.models;


import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.resource.PersonResource;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class PersonConversor {

    public Person conversor(PersonResource personResource) throws PersonResourceException {


        if (!checkPersonEmail(personResource.getEmail()))
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Email)");

        if (checkPersonFullName(personResource.getFullName()))
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Nome)");

        Person person = new Person();
        person.setId(personResource.getId());
        person.setEmail(personResource.getEmail());
        person.setFullName(personResource.getFullName());
        person.setPhone(personResource.getPhone());
        person.setRegistryNumber(personResource.getRegistryNumber());
        person.setSocialDocumentNumber(personResource.getSocialDocumentNumber());
        person.setCity(personResource.getCity());

        return person;
    }


    private boolean checkPersonEmail(String email) {
        return email.contains("@");
    }

    public boolean checkPersonFullName(String name) {
        return Pattern.compile("[0-9]").matcher(name).find();
    }


}
