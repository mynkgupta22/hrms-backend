package com.erp.hrms.model.common;

import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Module.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Module_ {

	
	/**
	 * @see com.erp.hrms.model.common.Module#uid
	 **/
	public static volatile SingularAttribute<Module, String> uid;
	
	/**
	 * @see com.erp.hrms.model.common.Module#editedUser
	 **/
	public static volatile SingularAttribute<Module, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.common.Module#subModule
	 **/
	public static volatile ListAttribute<Module, SubModule> subModule;
	
	/**
	 * @see com.erp.hrms.model.common.Module#moduleName
	 **/
	public static volatile SingularAttribute<Module, String> moduleName;
	
	/**
	 * @see com.erp.hrms.model.common.Module#editedAt
	 **/
	public static volatile SingularAttribute<Module, LocalDateTime> editedAt;
	
	/**
	 * @see com.erp.hrms.model.common.Module#id
	 **/
	public static volatile SingularAttribute<Module, Long> id;
	
	/**
	 * @see com.erp.hrms.model.common.Module#priority
	 **/
	public static volatile SingularAttribute<Module, Integer> priority;
	
	/**
	 * @see com.erp.hrms.model.common.Module
	 **/
	public static volatile EntityType<Module> class_;
	
	/**
	 * @see com.erp.hrms.model.common.Module#createdUser
	 **/
	public static volatile SingularAttribute<Module, User> createdUser;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String SUB_MODULE = "subModule";
	public static final String MODULE_NAME = "moduleName";
	public static final String EDITED_AT = "editedAt";
	public static final String ID = "id";
	public static final String PRIORITY = "priority";
	public static final String CREATED_USER = "createdUser";

}

