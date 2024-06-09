package com.erp.hrms.model.business;

import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table
public class CompanyAllotment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "uid", columnDefinition = "VARCHAR(255)", updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @ManyToOne
    private SubModule subModule;

    boolean enabled;


    @ManyToOne
    @JoinColumn(name = "editedby_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User editedUser;

    Timestamp editedDate = Timestamp.from(ZonedDateTime.now().toInstant());

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}

