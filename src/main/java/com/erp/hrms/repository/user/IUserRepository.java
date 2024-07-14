package com.erp.hrms.repository.user;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);

    boolean existsByEmailAndIsDeletedFalse(String email);

    User findByUserNameAndIsDeletedFalse(String username);

    User findByUidAndIsDeletedFalse(String userUid);

    List<User> findAllByCompanyAndIsDeletedFalse(Company company);
}
