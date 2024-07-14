package com.erp.hrms.api.response.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyAddress {
    private String plotNumber;
    private String area;
    private String city;
    private String state;
    private String pincode;


}
