package com.chinasoft.model.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */
public class Employee implements java.io.Serializable
{

	// Fields

	private String eid;
	private String userId;
	private String userName;
	private String department;
	private String position;
	private String password;
	private String phone;
	private Integer userLevel;
	private Integer age;
	private String sex;

	// Property accessors
	public String getEid()
	{
		return this.eid;
	}

	public void setEid(String eid)
	{
		this.eid = eid;
	}

	public String getUserId()
	{
		return this.userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getDepartment()
	{
		return this.department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getPosition()
	{
		return this.position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public Integer getUserLevel()
	{
		return this.userLevel;
	}

	public void setUserLevel(Integer userLevel)
	{
		this.userLevel = userLevel;
	}

	public Integer getAge()
	{
		return this.age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}
}