package com.erp.hrms.api.response.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyAllotmentResponse {

    private String uid;
    private String subModuleName;
    private String subModuleUid;
    private boolean enabled;
}
