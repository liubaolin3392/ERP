package com.chinasoft.model.entity;

/**
 * TrainApply entity. @author MyEclipse Persistence Tools
 */
public class TrainApply implements java.io.Serializable
{

	// Fields

	private String trainApplyId;
	private String trainDirect;
	private String trainLeader;
	private Integer trainMark;

	// Property accessors
	public String getTrainApplyId()
	{
		return this.trainApplyId;
	}

	public void setTrainApplyId(String trainApplyId)
	{
		this.trainApplyId = trainApplyId;
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