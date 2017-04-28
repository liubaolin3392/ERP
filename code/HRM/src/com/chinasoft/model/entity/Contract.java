package com.chinasoft.model.entity;

/**
 * Contract entity. @author MyEclipse Persistence Tools
 */
public class Contract implements java.io.Serializable
{

	// Fields

	private String contractId;
	private Employee employee;
	private String contractName;
	private String contractType;
	private String contractContect;

	// Constructors

	/** default constructor */
	public Contract()
	{
	}

	/** full constructor */
	public Contract(Employee employee, String contractName, String contractType, String contractContect)
	{
		this.employee = employee;
		this.contractName = contractName;
		this.contractType = contractType;
		this.contractContect = contractContect;
	}

	public String getContractId()
	{
		return this.contractId;
	}

	public void setContractId(String contractId)
	{
		this.contractId = contractId;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getContractName()
	{
		return this.contractName;
	}

	public void setContractName(String contractName)
	{
		this.contractName = contractName;
	}

	public String getContractType()
	{
		return this.contractType;
	}

	public void setContractType(String contractType)
	{
		this.contractType = contractType;
	}

	public String getContractContect()
	{
		return this.contractContect;
	}

	public void setContractContect(String contractContect)
	{
		this.contractContect = contractContect;
	}

}