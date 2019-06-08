package com.cps.manager.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * エンティティ：
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
public class UserEntity implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userID;
	private String userName;
	private String userPWD;
	private Date createDate;
	private Date passwordSetDate;
	private Timestamp beforeLoginTime;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPWD() {
		return userPWD;
	}
	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getPasswordSetDate() {
		return passwordSetDate;
	}
	public void setPasswordSetDate(Date passwordSetDate) {
		this.passwordSetDate = passwordSetDate;
	}
	public Timestamp getBeforeLoginTime() {
		return beforeLoginTime;
	}
	public void setBeforeLoginTime(Timestamp beforeLoginTime) {
		this.beforeLoginTime = beforeLoginTime;
	}
	
	
	
}
