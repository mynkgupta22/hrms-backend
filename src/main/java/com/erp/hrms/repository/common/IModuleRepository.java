package com.erp.hrms.repository.common;

import com.erp.hrms.model.common.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModuleRepository extends JpaRepository<Module,Long> {
}
