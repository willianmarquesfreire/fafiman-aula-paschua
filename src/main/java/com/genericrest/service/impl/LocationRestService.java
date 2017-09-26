package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.LocationDAO;
import com.genericrest.model.Location;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

@ManagedBean
@Path("/location")
class LocationRestService extends GenericCRUDRestService<Location> implements LocationService {

    private static final Logger LOG = LoggerFactory.getLogger(LocationRestService.class);

    @Inject
    private LocationDAO locationDAO;

    public LocationRestService() {
        super(Location.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Location> list) {
        return new GenericEntity<List<Location>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return locationDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}