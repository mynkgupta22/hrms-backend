package com.erp.hrms.service.user.impl;

import com.erp.hrms.api.request.user.UserRequest;
import com.erp.hrms.api.response.user.UserResponse;
import com.erp.hrms.exception.BadRequestException;
import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.Role;
import com.erp.hrms.model.users.User;
import com.erp.hrms.repository.business.ICompanyRepository;
import com.erp.hrms.repository.user.IUserRepository;
import com.erp.hrms.service.common.IContextService;
import com.erp.hrms.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private ICompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IContextService contextService;

    @Override
    public String createUser(UserRequest userRequest) {
        Company company = contextService.getCurrentCompany();
        if(company == null)
            throw new BadRequestException("Company Not Found.");
        User user = new User();
        if(userRepository.existsByEmailAndIsDeletedFalse(userRequest.getUserEmail()))
            throw new BadRequestException("User Email Already Exist.");
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getUserEmail());
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setEnabled(true);
        user.setUserName(userRequest.getUserEmail());
        user.setCompany(company);
        userRepository.save(user);
        return "User Created Successfully.";
    }

    @Override
    public UserResponse getUserDetails(String userUid) {
        User user = userRepository.findByUidAndIsDeletedFalse(userUid);
        if(user == null)
            throw new BadRequestException("User Not Found.");
        return new UserResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        Company company = contextService.getCurrentCompany();
        if(company == null)
            throw new BadRequestException("Company Not Found.");
        List<User> userList = userRepository.findAllByCompanyAndIsDeletedFalse(company);
        List<UserResponse> userResponseList = new ArrayList<>();
        if(userList != null){
            for(User user:userList) {
                UserResponse response = new UserResponse(user);
                userResponseList.add(response);
            }

        }
        return userResponseList;
    }

    @Override
    public String updateUser(UserRequest userRequest,String userUid) {
        User user = userRepository.findByUidAndIsDeletedFalse(userUid);
        if(user == null)
            throw new BadRequestException("User Not Found.");
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getUserEmail());
        return "User Updated Successfully.";
    }
}
