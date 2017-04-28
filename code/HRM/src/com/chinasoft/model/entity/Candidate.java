package com.chinasoft.model.entity;

/**
 * Candidate entity. @author MyEclipse Persistence Tools
 */
public class Candidate implements java.io.Serializable
{

	// Fields
	private String candidateId;
	private String candidateName;
	private String department;
	private String position;
	private String candidateInfo;
	private Integer candidateMark;

	public String getCandidateId()
	{
		return this.candidateId;
	}

	public void setCandidateId(String candidateId)
	{
		this.candidateId = candidateId;
	}

	public String getCandidateName()
	{
		return this.candidateName;
	}

	public void setCandidateName(String candidateName)
	{
		this.candidateName = candidateName;
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

	public String getCandidateInfo()
	{
		return this.candidateInfo;
	}

	public void setCandidateInfo(String candidateInfo)
	{
		this.candidateInfo = candidateInfo;
	}

	public Integer getCandidateMark()
	{
		return this.candidateMark;
	}

	public void setCandidateMark(Integer candidateMark)
	{
		this.candidateMark = candidateMark;
	}

}