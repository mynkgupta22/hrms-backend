package com.erp.hrms.model.hr.employee;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.settings.Designation;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(EmployeeInfo.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class EmployeeInfo_ {

	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#uid
	 **/
	public static volatile SingularAttribute<EmployeeInfo, String> uid;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#editedUser
	 **/
	public static volatile SingularAttribute<EmployeeInfo, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#createdDate
	 **/
	public static volatile SingularAttribute<EmployeeInfo, LocalDateTime> createdDate;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#isDeleted
	 **/
	public static volatile SingularAttribute<EmployeeInfo, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#editedDate
	 **/
	public static volatile SingularAttribute<EmployeeInfo, LocalDateTime> editedDate;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#company
	 **/
	public static volatile SingularAttribute<EmployeeInfo, Company> company;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#id
	 **/
	public static volatile SingularAttribute<EmployeeInfo, Long> id;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#designation
	 **/
	public static volatile SingularAttribute<EmployeeInfo, Designation> designation;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo
	 **/
	public static volatile EntityType<EmployeeInfo> class_;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#reportingTo
	 **/
	public static volatile SingularAttribute<EmployeeInfo, EmployeeInfo> reportingTo;
	
	/**
	 * @see com.erp.hrms.model.hr.employee.EmployeeInfo#createdUser
	 **/
	public static volatile SingularAttribute<EmployeeInfo, User> createdUser;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String CREATED_DATE = "createdDate";
	public static final String IS_DELETED = "isDeleted";
	public static final String EDITED_DATE = "editedDate";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String DESIGNATION = "designation";
	public static final String REPORTING_TO = "reportingTo";
	public static final String CREATED_USER = "createdUser";

}

