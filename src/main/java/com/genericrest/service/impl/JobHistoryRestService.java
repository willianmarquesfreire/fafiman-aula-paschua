package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.JobHistoryDAO;
import com.genericrest.model.Job;
import com.genericrest.model.JobHistory;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.JobHistoryService;
import com.genericrest.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

@ManagedBean
@Path("/jobhistory")
class JobHistoryRestService extends GenericCRUDRestService<JobHistory> implements JobHistoryService {

    private static final Logger LOG = LoggerFactory.getLogger(JobHistoryRestService.class);

    @Inject
    private JobHistoryDAO historyDAO;

    public JobHistoryRestService() {
        super(JobHistory.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<JobHistory> list) {
        return new GenericEntity<List<JobHistory>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return historyDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}