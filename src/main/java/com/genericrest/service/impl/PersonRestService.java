package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.PersonDAO;
import com.genericrest.model.Location;
import com.genericrest.model.Person;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.LocationService;
import com.genericrest.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

@ManagedBean
@Path("/person")
class PersonRestService extends GenericCRUDRestService<Person> implements PersonService {

    private static final Logger LOG = LoggerFactory.getLogger(PersonRestService.class);

    @Inject
    private PersonDAO personDAO;

    public PersonRestService() {
        super(Person.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Person> list) {
        return new GenericEntity<List<Person>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return personDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}