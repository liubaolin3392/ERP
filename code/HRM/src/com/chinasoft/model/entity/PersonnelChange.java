package com.chinasoft.model.entity;

/**
 * PersonnelChange entity. @author MyEclipse Persistence Tools
 */
public class PersonnelChange implements java.io.Serializable
{

	// Fields

	private String pcId;
	private String changeReason;
	private Integer doneMark;

	// Constructors


	// Property accessors
	public String getPcId()
	{
		return this.pcId;
	}

	public void setPcId(String pcId)
	{
		this.pcId = pcId;
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