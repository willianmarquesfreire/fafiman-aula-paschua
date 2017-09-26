package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.JobDAO;
import com.genericrest.model.Job;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

@ManagedBean
@Path("/job")
class JobRestService extends GenericCRUDRestService<Job> implements JobService {

    private static final Logger LOG = LoggerFactory.getLogger(JobRestService.class);

    @Inject
    private JobDAO departmentDAO;

    public JobRestService() {
        super(Job.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Job> list) {
        return new GenericEntity<List<Job>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return departmentDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}