package com.chinasoft.model.entity;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */
public class Salary implements java.io.Serializable
{

	// Fields

	private String sid;
	private Employee employee;
	private Double baseWage;
	private Double houseFund;
	private Double oldageFund;
	private Double medicalFund;
	private Double unemploymentFund;
	private Double reimbursement;
	private Double award;

	// Constructors

	/** default constructor */
	public Salary()
	{
	}

	/** full constructor */
	public Salary(Employee employee, Double baseWage, Double houseFund, Double oldageFund, Double medicalFund,
			Double unemploymentFund, Double reimbursement, Double award)
	{
		this.employee = employee;
		this.baseWage = baseWage;
		this.houseFund = houseFund;
		this.oldageFund = oldageFund;
		this.medicalFund = medicalFund;
		this.unemploymentFund = unemploymentFund;
		this.reimbursement = reimbursement;
		this.award = award;
	}

	// Property accessors
	public String getSid()
	{
		return this.sid;
	}

	public void setSid(String sid)
	{
		this.sid = sid;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public Double getBaseWage()
	{
		return this.baseWage;
	}

	public void setBaseWage(Double baseWage)
	{
		this.baseWage = baseWage;
	}

	public Double getHouseFund()
	{
		return this.houseFund;
	}

	public void setHouseFund(Double houseFund)
	{
		this.houseFund = houseFund;
	}

	public Double getOldageFund()
	{
		return this.oldageFund;
	}

	public void setOldageFund(Double oldageFund)
	{
		this.oldageFund = oldageFund;
	}

	public Double getMedicalFund()
	{
		return this.medicalFund;
	}

	public void setMedicalFund(Double medicalFund)
	{
		this.medicalFund = medicalFund;
	}

	public Double getUnemploymentFund()
	{
		return this.unemploymentFund;
	}

	public void setUnemploymentFund(Double unemploymentFund)
	{
		this.unemploymentFund = unemploymentFund;
	}

	public Double getReimbursement()
	{
		return this.reimbursement;
	}

	public void setReimbursement(Double reimbursement)
	{
		this.reimbursement = reimbursement;
	}

	public Double getAward()
	{
		return this.award;
	}

	public void setAward(Double award)
	{
		this.award = award;
	}

}