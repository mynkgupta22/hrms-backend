package com.erp.hrms.controller.user;

import com.erp.hrms.api.request.user.UserRequest;
import com.erp.hrms.api.response.user.UserResponse;
import com.erp.hrms.exception.BadRequestException;
import com.erp.hrms.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    // Create a new user
    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest) {
        try {
            String message = userService.createUser(userRequest);
            return ResponseEntity.ok(message);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Get user details by userUid
    @GetMapping("/get-user-details/{userUid}")
    public ResponseEntity<UserResponse> getUserDetails(@PathVariable String userUid) {
        try {
            UserResponse userResponse = userService.getUserDetails(userUid);
            return ResponseEntity.ok(userResponse);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(null); // You can handle the exception as needed
        }
    }

    // Get all users
    @GetMapping("/get-all-users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        try {
            List<UserResponse> users = userService.getAllUsers();
            return ResponseEntity.ok(users);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(null); // You can handle the exception as needed
        }
    }

    // Update user details by userUid
    @PutMapping("/update-user/{userUid}")
    public ResponseEntity<String> updateUser(@RequestBody UserRequest userRequest, @PathVariable String userUid) {
        try {
            String message = userService.updateUser(userRequest, userUid);
            return ResponseEntity.ok(message);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
