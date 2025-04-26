package com.erp.hrms.model.auth;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BlackListToken.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class BlackListToken_ {

	
	/**
	 * @see com.erp.hrms.model.auth.BlackListToken#uid
	 **/
	public static volatile SingularAttribute<BlackListToken, String> uid;
	
	/**
	 * @see com.erp.hrms.model.auth.BlackListToken#id
	 **/
	public static volatile SingularAttribute<BlackListToken, Long> id;
	
	/**
	 * @see com.erp.hrms.model.auth.BlackListToken#userName
	 **/
	public static volatile SingularAttribute<BlackListToken, String> userName;
	
	/**
	 * @see com.erp.hrms.model.auth.BlackListToken
	 **/
	public static volatile EntityType<BlackListToken> class_;
	
	/**
	 * @see com.erp.hrms.model.auth.BlackListToken#token
	 **/
	public static volatile SingularAttribute<BlackListToken, String> token;

	public static final String UID = "uid";
	public static final String ID = "id";
	public static final String USER_NAME = "userName";
	public static final String TOKEN = "token";

}

