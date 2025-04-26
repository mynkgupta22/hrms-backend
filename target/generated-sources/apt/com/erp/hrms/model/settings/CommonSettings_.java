package com.erp.hrms.model.settings;

import com.erp.hrms.model.business.Company;
import com.erp.hrms.model.users.User;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(CommonSettings.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CommonSettings_ {

	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#uid
	 **/
	public static volatile SingularAttribute<CommonSettings, String> uid;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#editedUser
	 **/
	public static volatile SingularAttribute<CommonSettings, User> editedUser;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#createdDate
	 **/
	public static volatile SingularAttribute<CommonSettings, LocalDateTime> createdDate;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#isDeleted
	 **/
	public static volatile SingularAttribute<CommonSettings, Boolean> isDeleted;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#editedDate
	 **/
	public static volatile SingularAttribute<CommonSettings, LocalDateTime> editedDate;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#typeValue
	 **/
	public static volatile SingularAttribute<CommonSettings, String> typeValue;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#company
	 **/
	public static volatile SingularAttribute<CommonSettings, Company> company;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#id
	 **/
	public static volatile SingularAttribute<CommonSettings, Long> id;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#type
	 **/
	public static volatile SingularAttribute<CommonSettings, CommonSettingType> type;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings
	 **/
	public static volatile EntityType<CommonSettings> class_;
	
	/**
	 * @see com.erp.hrms.model.settings.CommonSettings#createdUser
	 **/
	public static volatile SingularAttribute<CommonSettings, User> createdUser;

	public static final String UID = "uid";
	public static final String EDITED_USER = "editedUser";
	public static final String CREATED_DATE = "createdDate";
	public static final String IS_DELETED = "isDeleted";
	public static final String EDITED_DATE = "editedDate";
	public static final String TYPE_VALUE = "typeValue";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String CREATED_USER = "createdUser";

}

