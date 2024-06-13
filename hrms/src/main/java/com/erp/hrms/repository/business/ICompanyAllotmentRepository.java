package com.erp.hrms.repository.business;

import com.erp.hrms.model.business.CompanyAllotment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICompanyAllotmentRepository extends JpaRepository<CompanyAllotment,Long> {

    List<CompanyAllotment> findAllByUidIn(List<String> companyAllotmentsUids);
}
