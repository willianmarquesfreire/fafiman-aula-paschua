package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JobDAO;
import com.genericrest.dao.JobHistoryDAO;
import com.genericrest.model.Job;
import com.genericrest.model.JobHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JobHistoryDAOImpl extends GenericDAO<JobHistory, Long> implements JobHistoryDAO {

    private static final Logger LOG = LoggerFactory.getLogger(JobHistoryDAOImpl.class);

    public JobHistoryDAOImpl() {
        super(JobHistory.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}