package com.erp.hrms.api.request.business;

import com.erp.hrms.common.StringTrimConverter;
import com.erp.hrms.model.business.CompanyAllotment;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class CompanyRequest {

    private String companyName;

    private String companyAbb;

    private String plotNumber;

    private String area;

    private String city;

    private String pincode;

    private String state;

    private String phoneNo1;

    private String phoneNo2;

    private String contactName;

    private String contactMobile;

    private String contactEmail;

    private String companyLogo;

    private List<String> companyAllotmentsUids;

    private String password;

    private String firstName;

    private String lastName;

    private String userEmail;

}
