package com.erp.hrms.model.common;

import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(SubModule.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class SubModule_ {

	
	/**
	 * @see com.erp.hrms.model.common.SubModule#uid
	 **/
	public static volatile SingularAttribute<SubModule, String> uid;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#editedUser
	 **/
	public static volatile SingularAttribute<SubModule, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#module
	 **/
	public static volatile SingularAttribute<SubModule, Module> module;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#showOnAllotment
	 **/
	public static volatile SingularAttribute<SubModule, Boolean> showOnAllotment;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#editedAt
	 **/
	public static volatile SingularAttribute<SubModule, LocalDateTime> editedAt;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#id
	 **/
	public static volatile SingularAttribute<SubModule, Long> id;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#priority
	 **/
	public static volatile SingularAttribute<SubModule, Integer> priority;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule
	 **/
	public static volatile EntityType<SubModule> class_;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#subModuleName
	 **/
	public static volatile SingularAttribute<SubModule, String> subModuleName;
	
	/**
	 * @see com.erp.hrms.model.common.SubModule#createdUser
	 **/
	public static volatile SingularAttribute<SubModule, User> createdUser;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String MODULE = "module";
	public static final String SHOW_ON_ALLOTMENT = "showOnAllotment";
	public static final String EDITED_AT = "editedAt";
	public static final String ID = "id";
	public static final String PRIORITY = "priority";
	public static final String SUB_MODULE_NAME = "subModuleName";
	public static final String CREATED_USER = "createdUser";

}

