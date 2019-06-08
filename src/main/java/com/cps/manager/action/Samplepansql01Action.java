package com.cps.manager.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.manager.service.SamplePanSql01Service;
import com.cps.manager.service.SampleService;
import com.cps.manager.vo.ResmUser;
import com.cps.manager.vo.selectUserPan;
import com.opensymphony.xwork2.ActionContext;

/**
 * Actionアクション：
 * 
 * @author PAN
 * @date 2019/05/22
 * 
 */
@Component("Samplepansql01Action")
@ParentPackage("basePackage")
@Namespace("/")
@Action(className = "Samplepansql01Action", results = { @Result(name = "success", location = "Samplepansql01.jsp")
		/* ,@Result(name = "end", location = "Sample.jsp") */})
public class Samplepansql01Action extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired(required = true)
	private SamplePanSql01Service samplePanService;

	public String init() {

		ActionContext context = ActionContext.getContext();
		String title = "OK Pan init";
		context.put("title", title);

		return SUCCESS;
	}

	public String end() {

		ActionContext context = ActionContext.getContext();
		String title = "OK Pan end";
		context.put("title", title);

		return "END";
	}

	public String excutepan() {
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();

		String title = "OK Pan";
		context.put("title", title);

		String userid = map.get("userid").toString();
		String username = map.get("username").toString();
		String userpwd = map.get("userpwd").toString();

		// 类属性userid（el表达式）:
		context.put("userid", userid);
		context.put("username", username);
		context.put("userpwd", userpwd);

		// 类属性userid（el表达式）: ...${pan.userID}<br>
		// <s:property value="#attr.pan.userID" />
		selectUserPan selectuserpan = new selectUserPan();
		selectuserpan.setAge(93);
		selectuserpan.setUserID(userid);
		selectuserpan.setUserPWD(userpwd);
		context.put("pan", selectuserpan);

		samplePanService.addUserpan(userid, username, userpwd);
		return SUCCESS;
	}

	public String excuteUpdate() {
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();

		String title = "OK Pan updatePan";
		context.put("title", title);

		String userid = map.get("userid").toString();
		String username = map.get("username").toString();
		String userpwd = map.get("userpwd").toString();

		// 类属性userid（el表达式）:
		context.put("userid", userid);
		context.put("username", username);
		context.put("userpwd", userpwd);

		samplePanService.updateUserpan(userid, username, userpwd);
		return SUCCESS;
	}

	public String excuteDelete() {
		ActionContext context = ActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();

		String userid = map.get("userid").toString();
//		String username = map.get("username").toString();
		String userpwd = map.get("userpwd").toString();

		// 类属性userid（el表达式）: ...${pan.userID}<br>
		// <s:property value="#attr.pan.userID" />
		selectUserPan selectuserpan = new selectUserPan();
		selectuserpan.setAge(93);
		selectuserpan.setUserID(userid);
		selectuserpan.setUserPWD(userpwd);
		context.put("pan", selectuserpan);

		samplePanService.deleteUserpan(userid, "userpwd");
		return SUCCESS;
	}
}
