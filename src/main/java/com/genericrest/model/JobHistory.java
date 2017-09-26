package com.genericrest.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.ZonedDateTime;

@Entity
public class JobHistory extends Job {

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    @Enumerated(EnumType.STRING)
    private Language language;

    public JobHistory() {
    }

    @Override
    public void updateParameters(Object entity) {

    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
