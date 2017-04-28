package com.chinasoft.model.entity;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */
public class Salary implements java.io.Serializable
{

	// Fields

	private String sid;
	private Double baseWage;
	private Double houseFund;
	private Double oldageFund;
	private Double medicalFund;
	private Double unemploymentFund;
	private Double reimbursement;
	private Double award;

	// Property accessors
	public String getSid()
	{
		return this.sid;
	}

	public void setSid(String sid)
	{
		this.sid = sid;
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