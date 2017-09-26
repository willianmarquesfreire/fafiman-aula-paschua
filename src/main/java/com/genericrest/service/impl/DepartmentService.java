package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.DepartmentDAO;
import com.genericrest.model.Department;
import com.genericrest.service.DepartmentService;
import com.genericrest.service.GenericCRUDRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

@ManagedBean
@Path("/department")
class DepartmentRestService extends GenericCRUDRestService<Department> implements DepartmentService {

    private static final Logger LOG = LoggerFactory.getLogger(DepartmentRestService.class);

    @Inject
    private DepartmentDAO departmentDAO;

    public DepartmentRestService() {
        super(Department.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Department> list) {
        return new GenericEntity<List<Department>>(list) {
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