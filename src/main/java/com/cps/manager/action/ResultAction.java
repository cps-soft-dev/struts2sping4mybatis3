	package com.cps.manager.action;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.manager.dao.UserEntity;
import com.cps.manager.vo.CheckUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@Component("resultAction")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className = "resultAction", results = { @Result(name = "success", location = "result.jsp") })
public class ResultAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String excute() {
		
		System.out.println("result action start!!!!");
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();
		String name = map.get("userName").toString();
		String pwd = map.get("userPWD").toString();
		CheckUser user = new CheckUser();
		user.setUserName(name);
		user.setUserPWD(pwd);
		context.put("user", user);

		return SUCCESS;
	}
	


}
