package com.erp.hrms.api.request.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtAuthenticationRequest {
    private String userName;
    private String password;
}
