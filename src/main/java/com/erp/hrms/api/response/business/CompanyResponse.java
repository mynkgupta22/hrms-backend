package com.erp.hrms.api.response.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyResponse {

    private String uid;
    private String companyName;
    private String companyCode;
    private String companyAbb;
    private String companyEmail;
    private String companyLogo;
    private String phoneNo1;
    private String phoneNo2;
    private String contactName;
    private String contactMobile;
    private String contactEmail;
    private boolean Enabled;
    private CompanyAddress companyAddress;
    private List<CompanyAllotmentResponse> companyAllotmentResponseList;
}
