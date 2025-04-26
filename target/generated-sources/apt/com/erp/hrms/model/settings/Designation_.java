package com.erp.hrms.model.settings;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Designation.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Designation_ {

	
	/**
	 * @see com.erp.hrms.model.settings.Designation#designationName
	 **/
	public static volatile SingularAttribute<Designation, String> designationName;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#editedDate
	 **/
	public static volatile SingularAttribute<Designation, LocalDateTime> editedDate;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#priority
	 **/
	public static volatile SingularAttribute<Designation, Integer> priority;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#uid
	 **/
	public static volatile SingularAttribute<Designation, String> uid;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#editedUser
	 **/
	public static volatile SingularAttribute<Designation, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#createdDate
	 **/
	public static volatile SingularAttribute<Designation, LocalDateTime> createdDate;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#isDeleted
	 **/
	public static volatile SingularAttribute<Designation, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#company
	 **/
	public static volatile SingularAttribute<Designation, Company> company;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#id
	 **/
	public static volatile SingularAttribute<Designation, Long> id;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation
	 **/
	public static volatile EntityType<Designation> class_;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#subordinates
	 **/
	public static volatile SetAttribute<Designation, Designation> subordinates;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#reportingTo
	 **/
	public static volatile SingularAttribute<Designation, Designation> reportingTo;
	
	/**
	 * @see com.erp.hrms.model.settings.Designation#createdUser
	 **/
	public static volatile SingularAttribute<Designation, User> createdUser;

	public static final String DESIGNATION_NAME = "designationName";
	public static final String EDITED_DATE = "editedDate";
	public static final String PRIORITY = "priority";
	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String CREATED_DATE = "createdDate";
	public static final String IS_DELETED = "isDeleted";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String SUBORDINATES = "subordinates";
	public static final String REPORTING_TO = "reportingTo";
	public static final String CREATED_USER = "createdUser";

}

