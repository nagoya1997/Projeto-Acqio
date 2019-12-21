package com.acqio.resource;

import com.acqio.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CityResource {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("state")
    private State state;

    public CityResource() {
    }

    public CityResource(String id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
