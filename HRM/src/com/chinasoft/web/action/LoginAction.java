package com.chinasoft.web.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.LoginServiceImpl;

@Controller
@SessionAttributes("employee")   
@RequestMapping("login")
public class LoginAction
{

	@Resource
	private LoginServiceImpl loginServiceImpl;
	private Employee employee;
	private String msg;

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	@RequestMapping(value = "checkLoginInfo", method = RequestMethod.GET)
	@ResponseBody
	public  String login(@RequestBody Employee employee, ModelMap modelMap)
	{
		Employee loginA = loginServiceImpl.checkLoginData(employee);
		String result = "";
		if (loginA == null)
		{
			return "failure";
		} else
		{
			modelMap.addAttribute("employee", loginA);
			int level = loginA.getUserlevel();
			switch (level)
				{
				case 1:
					result = "employee";
					break;
				case 2:
					result = "branchManager";
					break;
				default:
					result = "president";
					break;
				}
		}
		return result;
	}
	@RequestMapping(value = "login" ,method = RequestMethod.GET)
	public String tologin() {
		return "login";
	}	
}
