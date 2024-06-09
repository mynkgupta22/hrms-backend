package com.erp.hrms.model.common;

import com.erp.hrms.common.StringTrimConverter;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SubModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uid", columnDefinition = "VARCHAR(255)", updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @NotBlank
    @Convert(converter = StringTrimConverter.class)
    private String subModuleName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Module module;

    @Column(name = "priority", nullable = false)
    private int priority;

    @Column(columnDefinition = "boolean default 'false'")
    private boolean showOnAllotment;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "createdBy_id", nullable = false)
    private User createdUser;

    Timestamp createdDate = Timestamp.from(ZonedDateTime.now().toInstant());

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "editedBy_id", nullable = false)
    private User editedUser;

    Timestamp editedDate = Timestamp.from(ZonedDateTime.now().toInstant());
}

