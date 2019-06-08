package com.cps.manager.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ベースアクション
 * 
 * @author SOUU
 * @date 2019/05/22
 * 
 */
@ParentPackage("basePackage")
@Namespace("/")
@Action(className = "BaseAction")
public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PrintWriter getWriter() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		return response.getWriter();
	}

	HttpSession getSession() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getSession();
	}

}
