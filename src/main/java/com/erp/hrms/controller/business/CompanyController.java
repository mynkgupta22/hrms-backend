package com.erp.hrms.controller.business;

import com.erp.hrms.api.request.business.CompanyRequest;
import com.erp.hrms.service.business.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final ICompanyService companyService;

    @PostMapping("register-company")
    public ResponseEntity<?> createCompany(@RequestBody CompanyRequest companyRequest){
        return new ResponseEntity<>(companyService.createCompany(companyRequest), HttpStatus.CREATED);
    }

}
