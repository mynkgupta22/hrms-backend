package com.erp.hrms.model.settings;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Department.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Department_ {

	
	/**
	 * @see com.erp.hrms.model.settings.Department#uid
	 **/
	public static volatile SingularAttribute<Department, String> uid;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#editedUser
	 **/
	public static volatile SingularAttribute<Department, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#createdDate
	 **/
	public static volatile SingularAttribute<Department, LocalDateTime> createdDate;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#isDeleted
	 **/
	public static volatile SingularAttribute<Department, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#DepartmentName
	 **/
	public static volatile SingularAttribute<Department, String> DepartmentName;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#editedDate
	 **/
	public static volatile SingularAttribute<Department, LocalDateTime> editedDate;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#typeValue
	 **/
	public static volatile SingularAttribute<Department, String> typeValue;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#company
	 **/
	public static volatile SingularAttribute<Department, Company> company;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#id
	 **/
	public static volatile SingularAttribute<Department, Long> id;
	
	/**
	 * @see com.erp.hrms.model.settings.Department
	 **/
	public static volatile EntityType<Department> class_;
	
	/**
	 * @see com.erp.hrms.model.settings.Department#createdUser
	 **/
	public static volatile SingularAttribute<Department, User> createdUser;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String CREATED_DATE = "createdDate";
	public static final String IS_DELETED = "isDeleted";
	public static final String DEPARTMENT_NAME = "DepartmentName";
	public static final String EDITED_DATE = "editedDate";
	public static final String TYPE_VALUE = "typeValue";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String CREATED_USER = "createdUser";

}

