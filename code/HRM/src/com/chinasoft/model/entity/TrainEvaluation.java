package com.chinasoft.model.entity;

/**
 * TrainEvaluation entity. @author MyEclipse Persistence Tools
 */
public class TrainEvaluation implements java.io.Serializable
{

	// Fields

	private String trainEvaId;
	private Employee employee;
	private String trainLeader;
	private String trainDirect;
	private String trainEvaluation;

	// Constructors

	/** default constructor */
	public TrainEvaluation()
	{
	}

	/** full constructor */
	public TrainEvaluation(Employee employee, String trainLeader, String trainDirect, String trainEvaluation)
	{
		this.employee = employee;
		this.trainLeader = trainLeader;
		this.trainDirect = trainDirect;
		this.trainEvaluation = trainEvaluation;
	}

	// Property accessors
	public String getTrainEvaId()
	{
		return this.trainEvaId;
	}

	public void setTrainEvaId(String trainEvaId)
	{
		this.trainEvaId = trainEvaId;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getTrainLeader()
	{
		return this.trainLeader;
	}

	public void setTrainLeader(String trainLeader)
	{
		this.trainLeader = trainLeader;
	}

	public String getTrainDirect()
	{
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect)
	{
		this.trainDirect = trainDirect;
	}

	public String getTrainEvaluation()
	{
		return this.trainEvaluation;
	}

	public void setTrainEvaluation(String trainEvaluation)
	{
		this.trainEvaluation = trainEvaluation;
	}

}