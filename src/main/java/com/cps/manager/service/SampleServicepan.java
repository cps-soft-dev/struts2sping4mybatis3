package com.cps.manager.service;



public interface SampleServicepan {
	
//	public void addUserpan( ResmUserpan resmUserpan );

	void addUserpan(String userid,String username,String userpwd);
	
	void deleteUser(String userid,String userpwd);
}
