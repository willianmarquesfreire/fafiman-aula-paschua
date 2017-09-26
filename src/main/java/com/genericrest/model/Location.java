package com.genericrest.model;

import javax.persistence.Entity;

@Entity
public class Location extends AbstractEntity {

    private String stressAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    public Location() {
    }

    @Override
    public void updateParameters(Object entity) {

    }

    public String getStressAddress() {
        return stressAddress;
    }

    public void setStressAddress(String stressAddress) {
        this.stressAddress = stressAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
}
