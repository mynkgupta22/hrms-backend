package com.erp.hrms.repository.common;

import com.erp.hrms.model.common.SubModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISubModuleRepository extends JpaRepository<SubModule,Long> {
    List<SubModule> findAllByUidIn(List<String> subModuleUids);
}
