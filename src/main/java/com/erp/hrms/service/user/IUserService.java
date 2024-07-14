package com.erp.hrms.service.user;

import com.erp.hrms.api.request.user.UserRequest;
import com.erp.hrms.api.response.user.UserResponse;
import com.erp.hrms.model.users.User;

import java.util.List;

public interface IUserService {

    public String createUser(UserRequest userRequest);

    public UserResponse getUserDetails(String userUid);

    public List<UserResponse> getAllUsers();

    public String updateUser(UserRequest userRequest,String userUid);

}
