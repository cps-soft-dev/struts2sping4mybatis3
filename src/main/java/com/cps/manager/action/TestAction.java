package com.cps.manager.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * アクション：
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
@ParentPackage("basePackage")
@Namespace("/")
public class TestAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Action(results={@Result(name="success", location="sample", type="redirectAction")})
	public String test() {
		System.out.println("OK lol");
		return SUCCESS;
	}
	
}
