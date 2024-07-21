package com.erp.hrms.model.settings;

import com.erp.hrms.common.StringTrimConverter;
import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonSettingValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @Enumerated(EnumType.STRING)
    private CommonSettingType type;

    @NotNull
    @Size(max = 255)
    @Convert(converter = StringTrimConverter.class)
    private String typeValue;

    @Column
    private boolean isDeleted = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
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
