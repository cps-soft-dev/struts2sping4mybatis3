package com.cps.manager.service;

import com.cps.manager.dao.CheckUserDao;

public class CheckUserService {
	private CheckUserDao userDao;

	public CheckUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(CheckUserDao userDao) {
		this.userDao = userDao;
	}
	public void updateUser() {
		this.userDao.updateCheckUser();
		
	}
	

}
