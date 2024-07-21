package com.erp.hrms.service.common;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;

public interface IContextService {
    public User getCurrentUser();

    public Company getCurrentCompany();

    public String getCurrentJwtToken();

    public String getCurrentUserNameFromToken();

    }
