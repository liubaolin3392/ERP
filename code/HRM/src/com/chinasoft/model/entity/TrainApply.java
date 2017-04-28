package com.chinasoft.model.entity;

/**
 * TrainApply entity. @author MyEclipse Persistence Tools
 */
public class TrainApply implements java.io.Serializable
{

	// Fields

	private String trainApplyId;
	private Employee employee;
	private String trainDirect;
	private String trainLeader;
	private Integer trainMark;

	// Constructors

	/** default constructor */
	public TrainApply()
	{
	}

	/** full constructor */
	public TrainApply(Employee employee, String trainDirect, String trainLeader, Integer trainMark)
	{
		this.employee = employee;
		this.trainDirect = trainDirect;
		this.trainLeader = trainLeader;
		this.trainMark = trainMark;
	}

	// Property accessors
	public String getTrainApplyId()
	{
		return this.trainApplyId;
	}

	public void setTrainApplyId(String trainApplyId)
	{
		this.trainApplyId = trainApplyId;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getTrainDirect()
	{
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect)
	{
		this.trainDirect = trainDirect;
	}

	public String getTrainLeader()
	{
		return this.trainLeader;
	}

	public void setTrainLeader(String trainLeader)
	{
		this.trainLeader = trainLeader;
	}

	public Integer getTrainMark()
	{
		return this.trainMark;
	}

	public void setTrainMark(Integer trainMark)
	{
		this.trainMark = trainMark;
	}

}