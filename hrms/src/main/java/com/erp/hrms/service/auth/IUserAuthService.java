package com.erp.hrms.service.auth;

import com.erp.hrms.api.request.auth.JwtAuthenticationRequest;
import com.erp.hrms.api.response.auth.JwtAuthenticationResponse;

public interface IUserAuthService {
    public JwtAuthenticationResponse authenticate(JwtAuthenticationRequest request);

}
