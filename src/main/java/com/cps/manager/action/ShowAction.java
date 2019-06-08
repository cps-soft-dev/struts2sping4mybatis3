	package com.cps.manager.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.stereotype.Component;

import com.cps.manager.dao.UserEntity;
import com.cps.manager.vo.CheckUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@Component("showAction")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className = "showAction", results = { @Result(name = "success", location = "CheckXmlSample.jsp") })
public class ShowAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	


}
