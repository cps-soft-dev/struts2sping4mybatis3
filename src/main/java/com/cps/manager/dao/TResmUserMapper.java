package com.cps.manager.dao;

import java.util.List;

/**
 * �C���^�[�t�F�[�X
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
public interface TResmUserMapper {
	
	public int insertUser(UserEntity userentity);
	
	public List<UserEntity> selectUser();
}
