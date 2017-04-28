package com.chinasoft.model.entity;

/**
 * TrainFeedback entity. @author MyEclipse Persistence Tools
 */
public class TrainFeedback implements java.io.Serializable
{

	// Fields

	private String trainFeedbackId;
	private Employee employee;
	private String trainDirect;
	private String trainFeedback;

	// Constructors

	/** default constructor */
	public TrainFeedback()
	{
	}

	/** minimal constructor */
	public TrainFeedback(Employee employee, String trainDirect)
	{
		this.employee = employee;
		this.trainDirect = trainDirect;
	}

	/** full constructor */
	public TrainFeedback(Employee employee, String trainDirect, String trainFeedback)
	{
		this.employee = employee;
		this.trainDirect = trainDirect;
		this.trainFeedback = trainFeedback;
	}

	// Property accessors
	public String getTrainFeedbackId()
	{
		return this.trainFeedbackId;
	}

	public void setTrainFeedbackId(String trainFeedbackId)
	{
		this.trainFeedbackId = trainFeedbackId;
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

	public String getTrainFeedback()
	{
		return this.trainFeedback;
	}

	public void setTrainFeedback(String trainFeedback)
	{
		this.trainFeedback = trainFeedback;
	}

}