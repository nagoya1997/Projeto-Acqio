package com.acqio.service;

import com.acqio.models.State;
import com.acqio.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FetchStateServiceImpl {

    @Autowired
    private StateRepository stateRepository;

    public List<State> fetchState(){
        List<State> list = stateRepository.findAll();
        return list;
    }

}
