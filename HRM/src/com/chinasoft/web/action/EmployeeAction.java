package com.chinasoft.web.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.EmployeeServiceImpl;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
@SessionAttributes("employee")
@RequestMapping("employee")
public class EmployeeAction
{

	@Resource
	private EmployeeServiceImpl employeeServiceImpl;
	private Employee employee;
	private String employeeInfos;

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getEmployeeInfos()
	{
		return employeeInfos;
	}

	public void setEmployeeInfos(String employeeInfos)
	{
		this.employeeInfos = employeeInfos;
	}

	@RequestMapping(value = "getAllEmployee", method = RequestMethod.POST)
	public @ResponseBody String getAllEmployee(@RequestParam String filterParam)
	{
		Gson gson = new Gson();
		Map<String, String> filterMap = gson.fromJson(filterParam, new TypeToken<Map<String, String>>()
		{
		}.getType());
		employeeInfos = gson.toJson(employeeServiceImpl.getAllEmployee(filterMap));
		return employeeInfos;
	}
}
