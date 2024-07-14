package com.erp.hrms.api.response.user;

import com.erp.hrms.model.users.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String uid;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private boolean enabled;
    private String role;


    public UserResponse(User user) {
        this.uid = user.getUid();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userName = user.getUserName();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
        this.role = user.getRoles().stream().findFirst().toString();
    }
}
