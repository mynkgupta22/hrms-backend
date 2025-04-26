package com.erp.hrms.model.business;

import com.erp.hrms.model.common.SubModule;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(CompanyAllotment.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CompanyAllotment_ {

	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#uid
	 **/
	public static volatile SingularAttribute<CompanyAllotment, String> uid;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#editedUser
	 **/
	public static volatile SingularAttribute<CompanyAllotment, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#subModule
	 **/
	public static volatile SingularAttribute<CompanyAllotment, SubModule> subModule;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#editedAt
	 **/
	public static volatile SingularAttribute<CompanyAllotment, LocalDateTime> editedAt;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#company
	 **/
	public static volatile SingularAttribute<CompanyAllotment, Company> company;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#id
	 **/
	public static volatile SingularAttribute<CompanyAllotment, Long> id;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment
	 **/
	public static volatile EntityType<CompanyAllotment> class_;
	
	/**
	 * @see com.erp.hrms.model.business.CompanyAllotment#enabled
	 **/
	public static volatile SingularAttribute<CompanyAllotment, Boolean> enabled;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String SUB_MODULE = "subModule";
	public static final String EDITED_AT = "editedAt";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String ENABLED = "enabled";

}

