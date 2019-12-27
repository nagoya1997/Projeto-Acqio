package com.acqio.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateResource {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    public StateResource() {
    }

    public StateResource(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
