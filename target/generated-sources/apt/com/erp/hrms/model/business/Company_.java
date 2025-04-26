package com.erp.hrms.model.business;

import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Company.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Company_ {

	
	/**
	 * @see com.erp.hrms.model.business.Company#area
	 **/
	public static volatile SingularAttribute<Company, String> area;
	
	/**
	 * @see com.erp.hrms.model.business.Company#companyCode
	 **/
	public static volatile SingularAttribute<Company, String> companyCode;
	
	/**
	 * @see com.erp.hrms.model.business.Company#pincode
	 **/
	public static volatile SingularAttribute<Company, String> pincode;
	
	/**
	 * @see com.erp.hrms.model.business.Company#contactMobile
	 **/
	public static volatile SingularAttribute<Company, String> contactMobile;
	
	/**
	 * @see com.erp.hrms.model.business.Company#city
	 **/
	public static volatile SingularAttribute<Company, String> city;
	
	/**
	 * @see com.erp.hrms.model.business.Company#contactEmail
	 **/
	public static volatile SingularAttribute<Company, String> contactEmail;
	
	/**
	 * @see com.erp.hrms.model.business.Company#contactName
	 **/
	public static volatile SingularAttribute<Company, String> contactName;
	
	/**
	 * @see com.erp.hrms.model.business.Company#companyLogo
	 **/
	public static volatile SingularAttribute<Company, String> companyLogo;
	
	/**
	 * @see com.erp.hrms.model.business.Company#companyName
	 **/
	public static volatile SingularAttribute<Company, String> companyName;
	
	/**
	 * @see com.erp.hrms.model.business.Company#enabled
	 **/
	public static volatile SingularAttribute<Company, Boolean> enabled;
	
	/**
	 * @see com.erp.hrms.model.business.Company#users
	 **/
	public static volatile ListAttribute<Company, User> users;
	
	/**
	 * @see com.erp.hrms.model.business.Company#phoneNo1
	 **/
	public static volatile SingularAttribute<Company, String> phoneNo1;
	
	/**
	 * @see com.erp.hrms.model.business.Company#uid
	 **/
	public static volatile SingularAttribute<Company, String> uid;
	
	/**
	 * @see com.erp.hrms.model.business.Company#phoneNo2
	 **/
	public static volatile SingularAttribute<Company, String> phoneNo2;
	
	/**
	 * @see com.erp.hrms.model.business.Company#isDeleted
	 **/
	public static volatile SingularAttribute<Company, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.business.Company#plotNumber
	 **/
	public static volatile SingularAttribute<Company, String> plotNumber;
	
	/**
	 * @see com.erp.hrms.model.business.Company#id
	 **/
	public static volatile SingularAttribute<Company, Long> id;
	
	/**
	 * @see com.erp.hrms.model.business.Company#state
	 **/
	public static volatile SingularAttribute<Company, String> state;
	
	/**
	 * @see com.erp.hrms.model.business.Company#companyAllotments
	 **/
	public static volatile ListAttribute<Company, CompanyAllotment> companyAllotments;
	
	/**
	 * @see com.erp.hrms.model.business.Company
	 **/
	public static volatile EntityType<Company> class_;
	
	/**
	 * @see com.erp.hrms.model.business.Company#companyAbb
	 **/
	public static volatile SingularAttribute<Company, String> companyAbb;

	public static final String AREA = "area";
	public static final String COMPANY_CODE = "companyCode";
	public static final String PINCODE = "pincode";
	public static final String CONTACT_MOBILE = "contactMobile";
	public static final String CITY = "city";
	public static final String CONTACT_EMAIL = "contactEmail";
	public static final String CONTACT_NAME = "contactName";
	public static final String COMPANY_LOGO = "companyLogo";
	public static final String COMPANY_NAME = "companyName";
	public static final String ENABLED = "enabled";
	public static final String USERS = "users";
	public static final String PHONE_NO1 = "phoneNo1";
	public static final String UID = "uid";
	public static final String PHONE_NO2 = "phoneNo2";
	public static final String IS_DELETED = "isDeleted";
	public static final String PLOT_NUMBER = "plotNumber";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String COMPANY_ALLOTMENTS = "companyAllotments";
	public static final String COMPANY_ABB = "companyAbb";

}

