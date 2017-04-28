package com.chinasoft.web.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.LoginService;

@Controller
public class LoginAction {
		
		private Employee employee;
		private String msg;
		@Resource
		private LoginService loginService;
		

		
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

		public String login(){			
			Employee  loginA = loginService.checkLogin(employee);
			String result = "";
			if (loginA == null) {
				msg = "账号或密码错误";
				return "failure";				
			}else {			
				ServletActionContext.getRequest().getSession().setAttribute("loginin", loginA);
				int level = loginA.getUserLevel();
 				switch (level) {
				case 1:
					result =  "employee";
					break;
				case 2:
					result =  "branchManager";
					break;
				default:
					result =  "president";
					break;
				}
			}			
			return result;
		}	
			
	
		
}
