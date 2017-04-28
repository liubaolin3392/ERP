package com.chinasoft.model.entity;

import java.sql.Timestamp;

/**
 * RecruitInfo entity. @author MyEclipse Persistence Tools
 */
public class RecruitInfo implements java.io.Serializable
{

	// Fields

	private String recruitId;
	private String department;
	private String position;
	private Timestamp recruitStartTime;
	private Integer recruitNum;
	private Timestamp recruitEndTime;
	private Timestamp republicTime;

	// Constructors

	/** default constructor */
	public RecruitInfo()
	{
	}

	/** minimal constructor */
	public RecruitInfo(String department, String position, Timestamp recruitStartTime)
	{
		this.department = department;
		this.position = position;
		this.recruitStartTime = recruitStartTime;
	}

	/** full constructor */
	public RecruitInfo(String department, String position, Timestamp recruitStartTime, Integer recruitNum,
			Timestamp recruitEndTime, Timestamp republicTime)
	{
		this.department = department;
		this.position = position;
		this.recruitStartTime = recruitStartTime;
		this.recruitNum = recruitNum;
		this.recruitEndTime = recruitEndTime;
		this.republicTime = republicTime;
	}

	// Property accessors
	public String getRecruitId()
	{
		return this.recruitId;
	}

	public void setRecruitId(String recruitId)
	{
		this.recruitId = recruitId;
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

	public Timestamp getRecruitStartTime()
	{
		return this.recruitStartTime;
	}

	public void setRecruitStartTime(Timestamp recruitStartTime)
	{
		this.recruitStartTime = recruitStartTime;
	}

	public Integer getRecruitNum()
	{
		return this.recruitNum;
	}

	public void setRecruitNum(Integer recruitNum)
	{
		this.recruitNum = recruitNum;
	}

	public Timestamp getRecruitEndTime()
	{
		return this.recruitEndTime;
	}

	public void setRecruitEndTime(Timestamp recruitEndTime)
	{
		this.recruitEndTime = recruitEndTime;
	}

	public Timestamp getRepublicTime()
	{
		return this.republicTime;
	}

	public void setRepublicTime(Timestamp republicTime)
	{
		this.republicTime = republicTime;
	}

}