package com.acqio.controller;

import com.acqio.exceptions.StateNotFoundException;
import com.acqio.exceptions.StateResourceException;
import com.acqio.models.State;
import com.acqio.repository.StateRepository;
import com.acqio.resource.StateResource;
import com.acqio.service.FetchStateByIdServiceImpl;
import com.acqio.service.FetchStateServiceImpl;
import com.acqio.service.SaveStateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private SaveStateServiceImpl service_SaveState;

    @Autowired
    private FetchStateServiceImpl service_FindAll;

    @Autowired
    private FetchStateByIdServiceImpl fetchStateByIdService;

    @GetMapping("state")
    public List<State> fetchState(){
        return service_FindAll.fetchState();
    }

    @GetMapping(value = "state/id/{id}")
    public State fetchStateById(@PathVariable(name = "id", required = true) Long id) throws StateNotFoundException {
        return fetchStateByIdService.fetchStateById(id);
    }

    @GetMapping(value = "state/save")
    @Transactional
    public void saveState(@RequestBody StateResource stateResource) throws StateResourceException {
        service_SaveState.saveState(stateResource);
    }

}
