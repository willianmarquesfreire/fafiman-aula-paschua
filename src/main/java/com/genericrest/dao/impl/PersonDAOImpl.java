package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.LocationDAO;
import com.genericrest.dao.PersonDAO;
import com.genericrest.model.Location;
import com.genericrest.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonDAOImpl extends GenericDAO<Person, Long> implements PersonDAO {

    private static final Logger LOG = LoggerFactory.getLogger(PersonDAOImpl.class);

    public PersonDAOImpl() {
        super(Person.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}