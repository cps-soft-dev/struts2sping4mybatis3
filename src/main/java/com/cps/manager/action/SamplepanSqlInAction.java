package com.cps.manager.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.manager.service.SampleService;
import com.cps.manager.service.SampleServicepan;
import com.cps.manager.vo.ResmUser;
import com.opensymphony.xwork2.ActionContext;

@Component("samplepanSqlInAction")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className="SamplepanSqlInAction",results={@Result(name="success", location="SamplepanSqlTest.jsp")})
public class SamplepanSqlInAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Framework
	@Autowired(required=true)
	private SampleServicepan sampleServicepan;
	
	public String excutepan() {
		
		//Framework ‰æ–Ê‚Ì’l
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();
		
		String userid = map.get("userid").toString();
		String username = map.get("username").toString();
		String userpwd = map.get("userpwd").toString();
		
//		ResmUser ru = new ResmUser();
//		ru.setAge(25);
//		context.put("message",name);
//		context.put("ru",ru);
//		System.out.println(name);
//		sampleServicepan.addUser(ru);
		
		sampleServicepan.addUserpan(userid,username,userpwd);
		return SUCCESS;
	}
	
//	@Autowired(required=true)
//	public String deleteSql() {
//		
//		//Framework ‰æ–Ê‚Ì’l
//		ActionContext context = ActionContext.getContext();
//		Map<String, Parameter> map = context.getParameters();
//		
//		String userid = map.get("userid").toString();
//		//String username = map.get("username").toString();
//		String userpwd = map.get("userpwd").toString();
//		ResmUser ru = new ResmUser();
//		ru.setAge(25);
//		context.put("message",name);
//		context.put("ru",ru);
//		System.out.println(name);
//		sampleServicepan.addUser(ru);
//		sampleServicepan.deleteUser(userid,userpwd);
//		return SUCCESS;
//	}
	
}
