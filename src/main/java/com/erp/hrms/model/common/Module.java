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
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uid", columnDefinition = "VARCHAR(255)", updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @NotBlank
    @Convert(converter = StringTrimConverter.class)
    private String moduleName;

    @Column(name = "priority", nullable = false)
    private int priority;

    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    List<SubModule> subModule = new ArrayList<>();


    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "createdBy_id", nullable = false)
    private User createdUser;

    LocalDateTime editedAt = LocalDateTime.now();
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "editedBy_id", nullable = false)
    private User editedUser;

}


