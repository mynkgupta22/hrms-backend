package com.erp.hrms.service.business.impl;

import com.erp.hrms.api.request.business.CompanyRequest;
import com.erp.hrms.exception.BadRequestException;
import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.business.CompanyAllotment;
import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.users.Role;
import com.erp.hrms.model.users.User;
import com.erp.hrms.repository.business.ICompanyAllotmentRepository;
import com.erp.hrms.repository.business.ICompanyRepository;
import com.erp.hrms.repository.common.ISubModuleRepository;
import com.erp.hrms.repository.user.IUserRepository;
import com.erp.hrms.service.business.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {

    private final ICompanyAllotmentRepository companyAllotmentRepository;

    private final ICompanyRepository companyRepository;

    private final IUserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final ISubModuleRepository subModuleRepository;


    @Override
    @Transactional
    public String createCompany(CompanyRequest companyRequest){
        Company company = new Company();
        if(companyRepository.existsByCompanyAbbAndIsDeletedFalse(companyRequest.getCompanyAbb()))
            throw new BadRequestException("Company Abb Already Exist. Please Choose Different Abb For Company.");
        Long maxCompanyId = companyRepository.findMaxId();
        company.setCompanyAbb(companyRequest.getCompanyAbb());
        company.setCompanyLogo(companyRequest.getCompanyLogo());
        company.setCompanyCode(companyRequest.getCompanyAbb()+maxCompanyId);
        company.setCompanyName(companyRequest.getCompanyName());
        if(companyRequest.getCompanyAllotmentsUids() != null && companyRequest.getCompanyAllotmentsUids().isEmpty()){
            List<CompanyAllotment> companyAllotmentList = getCompanyAllotmentList(companyRequest.getCompanyAllotmentsUids());
            company.setCompanyAllotments(companyAllotmentList);
        }
        company.setPlotNumber(companyRequest.getPlotNumber());
        company.setArea(companyRequest.getArea());
        company.setCity(companyRequest.getCity());
        company.setPincode(companyRequest.getPincode());
        company.setState(companyRequest.getState());
        company.setPhoneNo1(companyRequest.getPhoneNo1());
        company.setPhoneNo2(companyRequest.getPhoneNo2());
        company.setContactName(companyRequest.getContactName());
        company.setContactMobile(companyRequest.getContactMobile());
        company.setContactEmail(companyRequest.getContactEmail());
        company.setEnabled(true);
        User user = new User();
        if(userRepository.existsByEmailAndIsDeletedFalse(companyRequest.getUserEmail()))
            throw new BadRequestException("User Email Already Exist.");
        user.setFirstName(companyRequest.getFirstName());
        user.setLastName(companyRequest.getLastName());
        user.setEmail(companyRequest.getUserEmail());
        user.setRole(Role.ROLE_ADMIN);
        user.setPassword(passwordEncoder.encode(companyRequest.getPassword()));
        user.setEnabled(true);
        user.setUserName(companyRequest.getUserEmail());
        company.getUsers().add(user);
        companyRepository.save(company);
        return "Company Created Successfully.";
    }

    private List<CompanyAllotment> getCompanyAllotmentList(List<String> subModuleUids){
        List<SubModule> subModuleList = subModuleRepository.findAllByUidIn(subModuleUids);
        List<CompanyAllotment> companyAllotmentList = new ArrayList<>();
        if(subModuleList != null){
            for(SubModule subModule:subModuleList){
                CompanyAllotment companyAllotment = new CompanyAllotment();
                companyAllotment.setSubModule(subModule);
                companyAllotment.setEnabled(true);
                companyAllotmentList.add(companyAllotment);
            }
        }
        return companyAllotmentList;
    }

}
