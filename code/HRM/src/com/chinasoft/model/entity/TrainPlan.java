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
}