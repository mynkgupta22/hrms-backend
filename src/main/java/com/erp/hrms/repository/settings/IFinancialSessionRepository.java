package com.erp.hrms.repository.settings;

import com.erp.hrms.model.settings.FinancialSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFinancialSessionRepository extends JpaRepository<FinancialSession,Long> {
}
