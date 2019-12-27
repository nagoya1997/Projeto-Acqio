package com.acqio.resource;

import com.acqio.models.City;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonResource {

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("socialDocumentNumber")
    private Long socialDocumentNumber;

    @JsonProperty("registryNumber")
    private Long registryNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private Long phone;

    @JsonProperty("city")
    private City city;

    public PersonResource() {
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSocialDocumentNumber() {
        return socialDocumentNumber;
    }

    public void setSocialDocumentNumber(Long socialDocumentNumber) {
        this.socialDocumentNumber = socialDocumentNumber;
    }

    public Long getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(Long registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }



}
