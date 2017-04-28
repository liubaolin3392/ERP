package com.chinasoft.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;







import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class PresidentAction extends ActionSupport {
	@Resource
	private EmployeeService employeeService;
	
	private List<Employee> employees;

	private Employee employee;
	private String msg;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
		public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
		public String toemployee(){
			employees = employeeService.getAllEmployee();		
			return "toemployee";	
		}
		
//		修改员工
		public String updateEmployee(){
		
			if (employeeService.updateEmployee(employee)) {
				msg = "ok";
			}else {	
				msg = "nook";
			}
			return "update";
		}
		
//   删除员工
		public String deleteEmployee(){			
			if (employeeService.deleteEmployee(employee)) {
				msg = "ok";
			}else {	
				msg = "nook";
			}
			return "delete";
		}

public String  regist() {
	
	if (employeeService.addEmployee(employee)) {
		msg = "添加成功";
	}else{
		msg = "添加失败";
	}
	
	return "regist";
	}
	
public String  searchEmployee() {
	String userName = employee.getUserName();
	String department = employee.getDepartment();
	String position = employee.getPosition(); 
	Integer age = employee.getAge(); 
	String sex = employee.getSex();
	employees = employeeService.serchEmployees(userName, department, position, age, sex);
	return "searchEmployee";
	
}


}
		
