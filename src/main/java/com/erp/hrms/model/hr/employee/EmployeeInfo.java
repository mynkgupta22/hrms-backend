package com.erp.hrms.model.hr.employee;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.settings.Designation;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false,nullable = false)
    private String uid = UUID.randomUUID().toString();

    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Designation designation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private EmployeeInfo reportingTo;

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
