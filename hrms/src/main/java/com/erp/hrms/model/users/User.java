package com.erp.hrms.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String uid = UUID.randomUUID().toString();

    @Column(unique = true, nullable = false)
    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 1 ")
    private boolean enabled;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 0 ")
    private boolean deleted;

    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    private Timestamp editedAt;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles")
    private Set<Role> roles = new HashSet<>();
}
