package com.cps.manager.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.manager.dao.UserEntity;
import com.cps.manager.service.SampleService;
import com.cps.manager.vo.ResmUser;
import com.opensymphony.xwork2.ActionContext;

/**
 * Actionアクション：
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
@Component("sampleAction")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className="sampleAction",
	results={
		@Result(name = "success", location = "Sample.jsp"),
		@Result(name = "selectResult", location = "SelectResult.jsp")
	}
)
public class SampleAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired(required=true)
	private SampleService sampleService;
	
	public String init() {

		return SUCCESS;
	}
	
	public String excute() {
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();
		
		String name = map.get("name").toString();
		ResmUser ru = new ResmUser();
		ru.setAge(25);
		context.put("message",name);
		context.put("ru",ru);
		sampleService.addUser(ru);
		return SUCCESS;
	}
	
	public String selectuser() {
		ActionContext context = ActionContext.getContext();

		List<UserEntity> uelist = new ArrayList<UserEntity>();
		
		uelist = sampleService.selectUser();
		context.put("uelist", uelist);
		
		return "selectResult";
	}
	
}
