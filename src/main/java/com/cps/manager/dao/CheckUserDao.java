package com.cps.manager.dao;

import com.cps.manager.vo.CheckUser;

public class CheckUserDao {
	public CheckUser getCheckUser() {
		CheckUser user =new CheckUser();
		user.setUserName("wuqiong");
		user.setUserPWD("123");
		return user;
		
	}
	public void updateCheckUser() {
		
	}

}
