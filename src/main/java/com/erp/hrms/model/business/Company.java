package com.erp.hrms.model.business;

import com.erp.hrms.common.StringTrimConverter;
import com.erp.hrms.model.users.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uid", columnDefinition = "VARCHAR(255)", updatable = false, nullable = false)
    private String uid = UUID.randomUUID().toString();

    @NotNull
    @Convert(converter = StringTrimConverter.class)
    private String companyName;

    @NotNull
    @Convert(converter = StringTrimConverter.class)
    private String companyAbb;

    @Convert(converter = StringTrimConverter.class)
    private String plotNumber;

    @Convert(converter = StringTrimConverter.class)
    private String area;

    @Convert(converter = StringTrimConverter.class)
    private String city;

    @Convert(converter = StringTrimConverter.class)
    private String pincode;

    @Convert(converter = StringTrimConverter.class)
    private String state;

    @Convert(converter = StringTrimConverter.class)
    private String phoneNo1;

    @Convert(converter = StringTrimConverter.class)
    private String phoneNo2;

    @Convert(converter = StringTrimConverter.class)
    private String contactName;

    @Convert(converter = StringTrimConverter.class)
    private String contactMobile;

    @Convert(converter = StringTrimConverter.class)
    private String contactEmail;

    @Convert(converter = StringTrimConverter.class)
    private String companyCode;

    @Convert(converter = StringTrimConverter.class)
    private String companyLogo;

    @Transient
    private MultipartFile logo;

    private boolean enabled;

    @Column(nullable = false, columnDefinition = "boolean default 'false'")
    private boolean isDeleted;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();

    @OneToMany( cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    private List<CompanyAllotment> companyAllotments;

}
