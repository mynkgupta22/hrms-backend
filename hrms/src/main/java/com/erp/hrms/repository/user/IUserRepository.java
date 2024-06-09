package com.erp.hrms.repository.user;

import com.erp.hrms.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);

    User findByUserNameAndEnabledTrueAndDeletedFalse(String userName);

}
