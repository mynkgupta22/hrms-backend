package com.erp.hrms.repository.business;

import com.erp.hrms.model.business.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICompanyRepository extends JpaRepository<Company,Long> {
    boolean existsByCompanyAbbAndIsDeletedFalse(String companyAbb);

    @Query("SELECT MAX(c.id) FROM Company c")
    Long findMaxId();

    Company findByUidAndIsDeletedFalse(String companyUid);
}
