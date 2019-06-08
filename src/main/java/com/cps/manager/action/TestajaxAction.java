package com.cps.manager.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@ParentPackage("basePackage")
@Namespace("/")
public class TestajaxAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Action(results={@Result(name="success", location="jsps/ajax.jsp", type="redirect")})
	public String test() {
		System.out.println("OK lol");
		return SUCCESS;
	}
	
}
