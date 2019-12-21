package com.acqio.service;


import com.acqio.exceptions.PersonResourceException;
import com.acqio.models.Person;
import com.acqio.resource.PersonResource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.regex.Pattern;

@Component
public class PersonConversor {

    public Person conversor(PersonResource personResource) throws PersonResourceException {

        Long id;
        try
        {
            id = checkPersonId(personResource.getId());
        }catch(Exception e){
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Id)");
        }

        if(checkPersonEmail(personResource.getEmail()))
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Email)");

        if(checkPersonFullName(personResource.getFullName()))
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Nome)");

        Long phone;
        try
        {
            phone = checkPersonPhone(personResource.getPhone());
        }catch(Exception e){
            throw new PersonResourceException("Falha ao converter o resource em entidade! (Telefone)");
        }


        Person p = new Person();
        p.setId(id);
        p.setEmail(personResource.getEmail());
        p.setFullName(personResource.getFullName());
        p.setPhone(personResource.getPhone());
        p.setRegistryNumber(personResource.getRegistryNumber());
        p.setSocialDocumentNumber(personResource.getSocialDocumentNumber());
        p.setCity(personResource.getCity());


        return p;
    }

    private long checkPersonId(String id){
        return Long.parseLong(id);
    }

    private boolean checkPersonEmail(String email){
        return email.contains("@");
    }

    public boolean checkPersonFullName(String name){
        return Pattern.compile( "[0-9]" ).matcher(name).find();
    }

    private long checkPersonPhone(String phone){
        return Long.parseLong(phone);
    }



}
