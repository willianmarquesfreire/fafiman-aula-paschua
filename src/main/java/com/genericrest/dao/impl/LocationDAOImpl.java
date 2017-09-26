package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JobHistoryDAO;
import com.genericrest.dao.LocationDAO;
import com.genericrest.model.JobHistory;
import com.genericrest.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LocationDAOImpl extends GenericDAO<Location, Long> implements LocationDAO {

    private static final Logger LOG = LoggerFactory.getLogger(LocationDAOImpl.class);

    public LocationDAOImpl() {
        super(Location.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}