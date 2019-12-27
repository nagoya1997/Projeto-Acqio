package com.acqio.service;

import com.acqio.exceptions.StateResourceException;
import com.acqio.models.State;
import com.acqio.models.StateConversor;
import com.acqio.repository.StateRepository;
import com.acqio.resource.StateResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveStateServiceImpl {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private StateConversor stateConversor;

    public void saveState(StateResource stateResource) throws StateResourceException {
        try{
            State state = stateConversor.conversor(stateResource);
            stateRepository.saveAndFlush(state);
        }catch (Exception e){
            throw new StateResourceException(e.getMessage());
        }
    }


}
