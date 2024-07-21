package com.erp.hrms.model.business;

import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table
@AllArgsConstructor
public class CompanyAllotment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uid", columnDefinition = "VARCHAR(255)", updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private SubModule subModule;

    private boolean enabled;

    @ManyToOne
    @JoinColumn(name = "editedby_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User editedUser;

    private LocalDateTime editedAt = LocalDateTime.now();

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}

