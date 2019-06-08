package com.cps.manager.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cps.manager.dao.TResmUserMapper;
import com.cps.manager.dao.TResmUserPanMapper;
import com.cps.manager.dao.UserEntity;
import com.cps.manager.dao.UserPanEntity;
import com.cps.manager.service.SampleService;
import com.cps.manager.service.SampleServicepan;
import com.cps.manager.vo.ResmUser;

//test_test
@Service("sampleServicepan")
public class SampleServicepanImpl implements SampleServicepan {

	@Autowired(required=false)
	private TResmUserPanMapper trmpan;
	
	@Override
//	public void addUserpan( ResmUser resmUser ) {
	public void addUserpan( String userid,String username,String userpwd/* ResmUserpan resmUserpan */ ) {	
		UserPanEntity ue = new UserPanEntity();
		
		ue.setUserID(userid);
		ue.setUserName(username);
		ue.setUserPWD(userpwd);
		ue.setCreateDate(new Date());
		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));

		trmpan.insertUser(ue);
		
		System.out.println("service OK ----------------------------");
	}
	
	public void deleteUser( String userid,String userpwd ) {	
		UserPanEntity ue = new UserPanEntity();
		
		ue.setUserID(userid);
		
		if(userpwd != null) {
			ue.setUserPWD(userpwd);
		}
		
		
//		ue.setCreateDate(new Date());
//		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));

		trmpan.deleteUser(ue);
		
		System.out.println("service OK ----------------------------");
	}

}
