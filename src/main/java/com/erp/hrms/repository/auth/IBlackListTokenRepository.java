package com.erp.hrms.repository.auth;

import com.erp.hrms.model.auth.BlackListToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlackListTokenRepository extends JpaRepository<BlackListToken,Long> {
    boolean existsByUserNameAndToken(String userName, String token);
}
