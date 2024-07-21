package com.erp.hrms.model.settings;

import com.erp.hrms.common.StringTrimConverter;
import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class FinancialSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    private String uid = UUID.randomUUID().toString();

    @NotBlank
    @Size(max = 50)
    @Convert(converter = StringTrimConverter.class)
    private String sessionTitle;

    private LocalDate fromDate;

    private LocalDate toDate;

    private boolean isEnabled;

    @NotNull
    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    private int priority;

    @ManyToOne
    @JoinColumn(name = "createdby_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User createdUser;

    @ManyToOne
    @JoinColumn(name = "editedby_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User editedUser;

    @Column(updatable = false)
    LocalDateTime createdAt = LocalDateTime.now();

    LocalDateTime editedAt;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}
