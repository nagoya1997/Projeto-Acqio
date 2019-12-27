package com.acqio.service;

import com.acqio.exceptions.PersonNotFoundException;
import com.acqio.exceptions.StateNotFoundException;
import com.acqio.models.State;
import com.acqio.repository.StateRepository;
import com.acqio.resource.StateResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FetchStateByIdServiceImpl {

    @Autowired
    private StateRepository stateRepository;

    public State fetchStateById(Long id) throws StateNotFoundException {
        Optional<State> result = stateRepository.findById(id);

        State state = null;

        if(!result.isPresent()){
            throw new StateNotFoundException("Estado não encontrado");
        }else{
            state = result.get();
        }

        return state;
    }

}
