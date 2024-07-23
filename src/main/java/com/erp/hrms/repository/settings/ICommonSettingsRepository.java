package com.erp.hrms.repository.settings;

import com.erp.hrms.model.settings.CommonSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommonSettingsRepository extends JpaRepository<CommonSettings,Long> {
}
