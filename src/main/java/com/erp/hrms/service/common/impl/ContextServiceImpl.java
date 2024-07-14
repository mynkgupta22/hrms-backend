package com.erp.hrms.service.common.impl;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import com.erp.hrms.repository.business.ICompanyRepository;
import com.erp.hrms.repository.user.IUserRepository;
import com.erp.hrms.service.common.IContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class ContextServiceImpl implements IContextService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private ICompanyRepository companyRepository;

    @Override
    public User getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = "";
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return this.userRepository.findByUserNameAndIsDeletedFalse(username);
    }

    @Override
    public Company getCurrentCompany() {
        Object credentials = SecurityContextHolder.getContext().getAuthentication().getCredentials();
        String companyUid = "";

        if (credentials != null && ((String) credentials).trim().length() > 0) {
            companyUid = credentials.toString();

            return companyRepository.findByUidAndIsDeletedFalse(companyUid);
        }
        return null;
    }
}
