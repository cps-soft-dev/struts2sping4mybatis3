package com.cps.manager.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cps.manager.dao.TResmUserMapper;
import com.cps.manager.dao.TResmUserPanMapper;
import com.cps.manager.dao.UserEntity;
import com.cps.manager.dao.UserPanEntity;
import com.cps.manager.service.SamplePanSql01Service;
import com.cps.manager.service.SampleService;
import com.cps.manager.vo.ResmUser;

/**
 * �T�[�r�Ximpl�F
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
@Service("SamplePanSql01Service")
public class SamplePanSql01ServiceImpl implements SamplePanSql01Service {

	@Autowired(required = false)
	private TResmUserPanMapper trm;

	@Override
	// INSERT
	public void addUserpan(String userid, String username, String userpwd) {
		UserPanEntity ue = new UserPanEntity();

		ue.setUserID(userid);
		ue.setUserName(username);
		ue.setUserPWD(userpwd);
		ue.setCreateDate(new Date());
		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));

		trm.insertUser(ue);

		System.out.println("service OK ----------------------------");
	}

	// UPDATE
	public void updateUserpan(String userid, String username, String userpwd) {
		UserPanEntity ue = new UserPanEntity();

//		ue.setUserID(userid);

		if (userpwd != null) {
			ue.setUserPWD(userpwd);
		}

//		ue.setUserID(userid);
		ue.setUserName(username);
//		ue.setUserPWD(userpwd);
//		ue.setCreateDate(new Date());
//		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));

		trm.updateUser(ue);

		System.out.println("service OK ----------------------------");
	}

	// DELEET
	public void deleteUserpan(String userid, String userpwd) {
		UserPanEntity ue = new UserPanEntity();
		
		if (userid != null && userpwd != null) {
			ue.setUserID(userid);
			ue.setUserPWD(userpwd);
			ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));
		} else {
			return;
		}

		trm.deleteUser(ue);

		System.out.println("service OK ----------------------------");
	}

	// SELECT
	public void selectUserpan(String userid, String username, String userpwd) {
		UserPanEntity ue = new UserPanEntity();

		ue.setUserID(userid);
		ue.setUserName(username);
		ue.setUserPWD(userpwd);
		ue.setCreateDate(new Date());
		ue.setPasswordSetDate(new Date());
		ue.setBeforeLoginTime(new Timestamp(new Date().getTime()));

		trm.insertUser(ue);

		System.out.println("service OK ----------------------------");
	}

}
