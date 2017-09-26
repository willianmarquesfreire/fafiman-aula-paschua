package com.genericrest.dao.impl;

import com.genericrest.dao.DepartmentDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class DepartmentDAOImpl extends GenericDAO<Department, Long> implements DepartmentDAO {

    private static final Logger LOG = LoggerFactory.getLogger(DepartmentDAOImpl.class);

    public DepartmentDAOImpl() {
        super(Department.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}