package com.erp.hrms.service.common.impl;

import com.erp.hrms.model.users.User;
import com.erp.hrms.repository.user.IUserRepository;
import com.erp.hrms.service.common.IContextService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class ContextServiceImpl implements IContextService {

    private IUserRepository userRepository;

    @Override
    public User getCurrentUser() {
        String userName = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepository.findByUserName(userName);
    }
}
