package com.erp.hrms.model.users;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.common.Module;
import com.erp.hrms.model.settings.Department;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    private String uid = UUID.randomUUID().toString();

    @Enumerated(EnumType.STRING)
    private PermissionType permissionType;

    private Integer permission;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private SubModule subModule;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Department department;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Module module;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "createdby_id", nullable = false)
    private User createdUser;

    LocalDateTime createdDate = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "editedby_id", nullable = false)
    private User editedUser;

    LocalDateTime editedDate;
}
