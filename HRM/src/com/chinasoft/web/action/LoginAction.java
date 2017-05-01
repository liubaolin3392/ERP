package com.chinasoft.web.action;

import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.LoginServiceImpl;
import com.google.gson.Gson;

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
	public @ResponseBody String login(@RequestParam String employee, ModelMap modelMap)
	{
		Gson gson = new Gson();
		Employee tempEmployee = gson.fromJson(employee, Employee.class);
		
		Employee loginA = loginServiceImpl.checkLoginData(tempEmployee);
		if (loginA == null)
		{
			return "failure";
		} 
		else
		{
			modelMap.addAttribute("employee", loginA);
			String level = loginA.getUserlevel();
			switch (level)
				{
				case "1":
					msg = "employee";
					break;
				case "2":
					msg = "employee";
					break;
				default:
					msg = "president";
					break;
				}
		}
		return msg;
	}
}
