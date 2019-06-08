package com.cps.manager.service;

import java.util.List;

import com.cps.manager.dao.UserEntity;
import com.cps.manager.vo.ResmUser;

/**
 * サービス：
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
public interface SampleService {
	
	public void addUser(ResmUser resmUser);
	
	public List<UserEntity> selectUser();
}
