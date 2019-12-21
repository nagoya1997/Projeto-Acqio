package com.acqio.resource;

import com.acqio.models.City;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonResource
{

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("socialDocumentNumber")
    private String socialDocumentNumber;

    @JsonProperty("registryNumber")
    private String registryNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("city")
    private City city;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSocialDocumentNumber() {
        return socialDocumentNumber;
    }

    public void setSocialDocumentNumber(String socialDocumentNumber) {
        this.socialDocumentNumber = socialDocumentNumber;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public PersonResource() {
    }

}
