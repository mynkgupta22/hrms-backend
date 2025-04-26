package com.erp.hrms.model.settings;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalDateTime;

@StaticMetamodel(FinancialSession.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class FinancialSession_ {

	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#toDate
	 **/
	public static volatile SingularAttribute<FinancialSession, LocalDate> toDate;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#priority
	 **/
	public static volatile SingularAttribute<FinancialSession, Integer> priority;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#fromDate
	 **/
	public static volatile SingularAttribute<FinancialSession, LocalDate> fromDate;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#uid
	 **/
	public static volatile SingularAttribute<FinancialSession, String> uid;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#createdAt
	 **/
	public static volatile SingularAttribute<FinancialSession, LocalDateTime> createdAt;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#editedUser
	 **/
	public static volatile SingularAttribute<FinancialSession, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#isDeleted
	 **/
	public static volatile SingularAttribute<FinancialSession, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#isEnabled
	 **/
	public static volatile SingularAttribute<FinancialSession, Boolean> isEnabled;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#editedAt
	 **/
	public static volatile SingularAttribute<FinancialSession, LocalDateTime> editedAt;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#sessionTitle
	 **/
	public static volatile SingularAttribute<FinancialSession, String> sessionTitle;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#company
	 **/
	public static volatile SingularAttribute<FinancialSession, Company> company;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#id
	 **/
	public static volatile SingularAttribute<FinancialSession, Long> id;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession
	 **/
	public static volatile EntityType<FinancialSession> class_;
	
	/**
	 * @see com.erp.hrms.model.settings.FinancialSession#createdUser
	 **/
	public static volatile SingularAttribute<FinancialSession, User> createdUser;

	public static final String TO_DATE = "toDate";
	public static final String PRIORITY = "priority";
	public static final String FROM_DATE = "fromDate";
	public static final String UID = "uid";
	public static final String CREATED_AT = "createdAt";
	public static final String EDITED_USER = "editedUser";
	public static final String IS_DELETED = "isDeleted";
	public static final String IS_ENABLED = "isEnabled";
	public static final String EDITED_AT = "editedAt";
	public static final String SESSION_TITLE = "sessionTitle";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String CREATED_USER = "createdUser";

}

