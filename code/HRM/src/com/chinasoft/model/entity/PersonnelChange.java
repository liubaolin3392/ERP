package com.chinasoft.model.entity;

/**
 * PersonnelChange entity. @author MyEclipse Persistence Tools
 */
public class PersonnelChange implements java.io.Serializable
{

	// Fields

	private String pcId;
	private Employee employee;
	private String changeReason;
	private Integer doneMark;

	// Constructors

	/** default constructor */
	public PersonnelChange()
	{
	}

	/** full constructor */
	public PersonnelChange(Employee employee, String changeReason, Integer doneMark)
	{
		this.employee = employee;
		this.changeReason = changeReason;
		this.doneMark = doneMark;
	}

	// Property accessors
	public String getPcId()
	{
		return this.pcId;
	}

	public void setPcId(String pcId)
	{
		this.pcId = pcId;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getChangeReason()
	{
		return this.changeReason;
	}

	public void setChangeReason(String changeReason)
	{
		this.changeReason = changeReason;
	}

	public Integer getDoneMark()
	{
		return this.doneMark;
	}

	public void setDoneMark(Integer doneMark)
	{
		this.doneMark = doneMark;
	}

}