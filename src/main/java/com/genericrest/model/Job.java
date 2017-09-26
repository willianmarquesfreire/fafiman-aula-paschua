package com.genericrest.model;

import javax.persistence.Entity;

@Entity
public class Job extends AbstractEntity {

    private String jobTitle;

    private Long minSalary;

    private Long maxSalary;

    public Job() {
    }

    @Override
    public void updateParameters(Object entity) {

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    public Long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }
}
