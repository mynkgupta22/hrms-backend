package com.erp.hrms.model.users;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.common.Module;
import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.settings.Department;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(UserPermission.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class UserPermission_ {

	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#permissionType
	 **/
	public static volatile SingularAttribute<UserPermission, PermissionType> permissionType;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#module
	 **/
	public static volatile SingularAttribute<UserPermission, Module> module;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#editedDate
	 **/
	public static volatile SingularAttribute<UserPermission, LocalDateTime> editedDate;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#permission
	 **/
	public static volatile SingularAttribute<UserPermission, Integer> permission;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#uid
	 **/
	public static volatile SingularAttribute<UserPermission, String> uid;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#editedUser
	 **/
	public static volatile SingularAttribute<UserPermission, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#createdDate
	 **/
	public static volatile SingularAttribute<UserPermission, LocalDateTime> createdDate;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#subModule
	 **/
	public static volatile SingularAttribute<UserPermission, SubModule> subModule;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#company
	 **/
	public static volatile SingularAttribute<UserPermission, Company> company;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#id
	 **/
	public static volatile SingularAttribute<UserPermission, Long> id;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#department
	 **/
	public static volatile SingularAttribute<UserPermission, Department> department;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission
	 **/
	public static volatile EntityType<UserPermission> class_;
	
	/**
	 * @see com.erp.hrms.model.users.UserPermission#createdUser
	 **/
	public static volatile SingularAttribute<UserPermission, User> createdUser;

	public static final String PERMISSION_TYPE = "permissionType";
	public static final String MODULE = "module";
	public static final String EDITED_DATE = "editedDate";
	public static final String PERMISSION = "permission";
	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String CREATED_DATE = "createdDate";
	public static final String SUB_MODULE = "subModule";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String DEPARTMENT = "department";
	public static final String CREATED_USER = "createdUser";

}

