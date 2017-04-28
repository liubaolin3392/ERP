package com.chinasoft.model.entity;

/**
 * TrainProgram entity. @author MyEclipse Persistence Tools
 */
public class TrainProgram implements java.io.Serializable
{

	// Fields

	private String trainProgramId;
	private TrainPlan trainPlan;
	private String trainPlace;
	private String trainInfo;
	private Double trainPrice;

	// Constructors

	/** default constructor */
	public TrainProgram()
	{
	}

	/** full constructor */
	public TrainProgram(TrainPlan trainPlan, String trainPlace, String trainInfo, Double trainPrice)
	{
		this.trainPlan = trainPlan;
		this.trainPlace = trainPlace;
		this.trainInfo = trainInfo;
		this.trainPrice = trainPrice;
	}

	// Property accessors
	public String getTrainProgramId()
	{
		return this.trainProgramId;
	}

	public void setTrainProgramId(String trainProgramId)
	{
		this.trainProgramId = trainProgramId;
	}

	public TrainPlan getTrainPlan()
	{
		return this.trainPlan;
	}

	public void setTrainPlan(TrainPlan trainPlan)
	{
		this.trainPlan = trainPlan;
	}

	public String getTrainPlace()
	{
		return this.trainPlace;
	}

	public void setTrainPlace(String trainPlace)
	{
		this.trainPlace = trainPlace;
	}

	public String getTrainInfo()
	{
		return this.trainInfo;
	}

	public void setTrainInfo(String trainInfo)
	{
		this.trainInfo = trainInfo;
	}

	public Double getTrainPrice()
	{
		return this.trainPrice;
	}

	public void setTrainPrice(Double trainPrice)
	{
		this.trainPrice = trainPrice;
	}

}