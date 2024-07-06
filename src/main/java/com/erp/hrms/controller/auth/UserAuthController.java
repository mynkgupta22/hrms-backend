package com.erp.hrms.controller.auth;

import com.erp.hrms.api.request.auth.JwtAuthenticationRequest;
import com.erp.hrms.service.auth.IUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthController {

    @Autowired
    private IUserAuthService userAuthService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody JwtAuthenticationRequest request){
        return ResponseEntity.ok(userAuthService.authenticate(request));
    }
}
