package com.genericrest.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Department extends AbstractEntity {

    private String departmentName;

    @ManyToOne
    private Location location;

    public Department() {
    }

    @Override
    public void updateParameters(Object entity) {

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
