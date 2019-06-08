package com.cps.manager.service;

import com.cps.manager.vo.ResmUser;

/**
 * �T�[�r�X�F
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
public interface SamplePanSql01Service {
	
	//public void addUser(ResmUser resmUser);
	void addUserpan(String userid,String username,String userpwd);
	void updateUserpan(String userid,String username,String userpwd);
	void deleteUserpan(String userid,String userpwd);
	void selectUserpan(String userid,String username,String userpwd);
}
