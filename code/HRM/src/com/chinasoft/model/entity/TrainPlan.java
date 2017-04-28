package com.chinasoft.model.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TrainPlan entity. @author MyEclipse Persistence Tools
 */
public class TrainPlan implements java.io.Serializable
{

	// Fields

	private String trainPlanId;
	private String trainDirect;
	private String trainObject;
	private String trainContent;
	private Timestamp trainStartTime;
	private String trainContinueTime;
	private Set<TrainProgram> trainPrograms = new HashSet<TrainProgram>(0);

	// Constructors

	/** default constructor */
	public TrainPlan()
	{
	}

	/** minimal constructor */
	public TrainPlan(String trainDirect, String trainObject, String trainContent, Timestamp trainStartTime,
			String trainContinueTime)
	{
		this.trainDirect = trainDirect;
		this.trainObject = trainObject;
		this.trainContent = trainContent;
		this.trainStartTime = trainStartTime;
		this.trainContinueTime = trainContinueTime;
	}

	/** full constructor */
	public TrainPlan(String trainDirect, String trainObject, String trainContent, Timestamp trainStartTime,
			String trainContinueTime, Set<TrainProgram> trainPrograms)
	{
		this.trainDirect = trainDirect;
		this.trainObject = trainObject;
		this.trainContent = trainContent;
		this.trainStartTime = trainStartTime;
		this.trainContinueTime = trainContinueTime;
		this.trainPrograms = trainPrograms;
	}

	// Property accessors
	public String getTrainPlanId()
	{
		return this.trainPlanId;
	}

	public void setTrainPlanId(String trainPlanId)
	{
		this.trainPlanId = trainPlanId;
	}

	public String getTrainDirect()
	{
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect)
	{
		this.trainDirect = trainDirect;
	}

	public String getTrainObject()
	{
		return this.trainObject;
	}

	public void setTrainObject(String trainObject)
	{
		this.trainObject = trainObject;
	}

	public String getTrainContent()
	{
		return this.trainContent;
	}

	public void setTrainContent(String trainContent)
	{
		this.trainContent = trainContent;
	}

	public Timestamp getTrainStartTime()
	{
		return this.trainStartTime;
	}

	public void setTrainStartTime(Timestamp trainStartTime)
	{
		this.trainStartTime = trainStartTime;
	}

	public String getTrainContinueTime()
	{
		return this.trainContinueTime;
	}

	public void setTrainContinueTime(String trainContinueTime)
	{
		this.trainContinueTime = trainContinueTime;
	}

	public Set<TrainProgram> getTrainPrograms()
	{
		return this.trainPrograms;
	}

	public void setTrainPrograms(Set<TrainProgram> trainPrograms)
	{
		this.trainPrograms = trainPrograms;
	}

}