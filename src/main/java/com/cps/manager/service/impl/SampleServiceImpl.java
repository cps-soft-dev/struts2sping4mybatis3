package com.cps.manager.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cps.manager.dao.TResmUserMapper;
import com.cps.manager.dao.UserEntity;
import com.cps.manager.service.SampleService;
import com.cps.manager.vo.ResmUser;

/**
 * サービスimpl：
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired(required=false)
	private TResmUserMapper trm;
	
	@Override
	public void addUser(ResmUser resmUser) {
		
		UserEntity ue = new UserEntity();
		
		ue.setUserID("00001");
		ue.setUserName("AAA");
		ue.setUserPWD("qweqwe");
		ue.setCreateDate(new Date());
		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(System.currentTimeMillis()));

		trm.insertUser(ue);
		
		System.out.println("service OK ----------------------------");
	}
	
	@Override
	public List<UserEntity> selectUser() {
		
		List<UserEntity> uelist = new ArrayList<UserEntity>();
		
		
		uelist = trm.selectUser();
		
		return uelist;
	}

}
