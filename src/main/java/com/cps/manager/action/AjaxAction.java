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
import com.cps.manager.vo.ResmUser;
import com.opensymphony.xwork2.ActionContext;

@Component("ajaxAction")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className="ajaxAction",results={@Result(name="success", location="ajax.jsp")})
public class AjaxAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5375564510932427341L;
	@Autowired(required=true)
	private SampleService sampleService;
	
	public String excute() {
		ActionContext context = ActionContext.getContext();

		Map<String, Parameter> map = context.getParameters();
		
		String name = map.get("name").toString();
		ResmUser ru = new ResmUser();
		ru.setAge(25);
		context.put("message",name);
		context.put("ru",ru);
		System.out.println(name);
		sampleService.addUser(ru);
		return SUCCESS;
	}
	
}
