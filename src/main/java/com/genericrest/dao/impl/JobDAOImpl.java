package com.genericrest.dao.impl;

import com.genericrest.dao.DepartmentDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JobDAO;
import com.genericrest.model.Department;
import com.genericrest.model.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JobDAOImpl extends GenericDAO<Job, Long> implements JobDAO {

    private static final Logger LOG = LoggerFactory.getLogger(JobDAOImpl.class);

    public JobDAOImpl() {
        super(Job.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}