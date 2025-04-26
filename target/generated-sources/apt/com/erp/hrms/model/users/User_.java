package com.erp.hrms.model.users;

import com.erp.hrms.model.business.Company;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(User.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class User_ {

	
	/**
	 * @see com.erp.hrms.model.users.User#lastName
	 **/
	public static volatile SingularAttribute<User, String> lastName;
	
	/**
	 * @see com.erp.hrms.model.users.User#role
	 **/
	public static volatile SingularAttribute<User, Role> role;
	
	/**
	 * @see com.erp.hrms.model.users.User#userName
	 **/
	public static volatile SingularAttribute<User, String> userName;
	
	/**
	 * @see com.erp.hrms.model.users.User#enabled
	 **/
	public static volatile SingularAttribute<User, Boolean> enabled;
	
	/**
	 * @see com.erp.hrms.model.users.User#userPermissionList
	 **/
	public static volatile ListAttribute<User, UserPermission> userPermissionList;
	
	/**
	 * @see com.erp.hrms.model.users.User#uid
	 **/
	public static volatile SingularAttribute<User, String> uid;
	
	/**
	 * @see com.erp.hrms.model.users.User#firstName
	 **/
	public static volatile SingularAttribute<User, String> firstName;
	
	/**
	 * @see com.erp.hrms.model.users.User#createdAt
	 **/
	public static volatile SingularAttribute<User, LocalDateTime> createdAt;
	
	/**
	 * @see com.erp.hrms.model.users.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see com.erp.hrms.model.users.User#isDeleted
	 **/
	public static volatile SingularAttribute<User, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.users.User#editedAt
	 **/
	public static volatile SingularAttribute<User, LocalDateTime> editedAt;
	
	/**
	 * @see com.erp.hrms.model.users.User#company
	 **/
	public static volatile SingularAttribute<User, Company> company;
	
	/**
	 * @see com.erp.hrms.model.users.User#id
	 **/
	public static volatile SingularAttribute<User, Long> id;
	
	/**
	 * @see com.erp.hrms.model.users.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see com.erp.hrms.model.users.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;

	public static final String LAST_NAME = "lastName";
	public static final String ROLE = "role";
	public static final String USER_NAME = "userName";
	public static final String ENABLED = "enabled";
	public static final String USER_PERMISSION_LIST = "userPermissionList";
	public static final String UID = "uid";
	public static final String FIRST_NAME = "firstName";
	public static final String CREATED_AT = "createdAt";
	public static final String PASSWORD = "password";
	public static final String IS_DELETED = "isDeleted";
	public static final String EDITED_AT = "editedAt";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

