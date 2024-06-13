package com.erp.hrms.service.auth.impl;

import com.erp.hrms.api.request.auth.JwtAuthenticationRequest;
import com.erp.hrms.api.response.auth.JwtAuthenticationResponse;
import com.erp.hrms.common.JwtTokenUtil;
import com.erp.hrms.exception.BadRequestException;
import com.erp.hrms.model.users.User;
import com.erp.hrms.repository.user.IUserRepository;
import com.erp.hrms.service.auth.IUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements IUserAuthService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public JwtAuthenticationResponse authenticate(JwtAuthenticationRequest request) {
        User user = userRepository.findByUserName(request.getUserName());
        if (!passwordEncoder.matches(request.getPassword(),user.getPassword())) {
            throw new BadRequestException("Incorrect UserName or Password");
        }
        return new
                JwtAuthenticationResponse(jwtTokenUtil.generateToken(user, null));

    }


}
