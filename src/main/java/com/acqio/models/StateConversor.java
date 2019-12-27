package com.acqio.models;

import com.acqio.exceptions.CityResourceException;
import com.acqio.exceptions.StateResourceException;
import com.acqio.resource.StateResource;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class StateConversor {

    public State conversor(StateResource stateResource) throws StateResourceException {

        if (checkStateName(stateResource.getName()))
            throw new StateResourceException("Falha ao converter o resource em entidade! (Nome)");

        State state = new State();
        state.setId(stateResource.getId());
        state.setName(stateResource.getName());

        return state;

    }

    private boolean checkStateName(String name){
        return Pattern.compile("[0-9]").matcher(name).find();
    }


}
