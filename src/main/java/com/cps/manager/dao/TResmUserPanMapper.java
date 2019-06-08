package com.cps.manager.dao;

/**
 * �C���^�[�t�F�[�X
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
public interface TResmUserPanMapper {
	
	public int insertUser(UserPanEntity userentity);
	
	public int updateUser(UserPanEntity userentity);
	
	public int deleteUser(UserPanEntity userentity);
	
	public int selectUser(UserPanEntity userentity);
}
