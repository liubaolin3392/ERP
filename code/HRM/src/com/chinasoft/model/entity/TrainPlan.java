package com.chinasoft.model.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TrainPlan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trainPlan", schema = "dbo", catalog = "HRM")
public class TrainPlan implements java.io.Serializable {

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
	public TrainPlan() {
	}

	/** minimal constructor */
	public TrainPlan(String trainDirect, String trainObject,
			String trainContent, Timestamp trainStartTime,
			String trainContinueTime) {
		this.trainDirect = trainDirect;
		this.trainObject = trainObject;
		this.trainContent = trainContent;
		this.trainStartTime = trainStartTime;
		this.trainContinueTime = trainContinueTime;
	}

	/** full constructor */
	public TrainPlan(String trainDirect, String trainObject,
			String trainContent, Timestamp trainStartTime,
			String trainContinueTime, Set<TrainProgram> trainPrograms) {
		this.trainDirect = trainDirect;
		this.trainObject = trainObject;
		this.trainContent = trainContent;
		this.trainStartTime = trainStartTime;
		this.trainContinueTime = trainContinueTime;
		this.trainPrograms = trainPrograms;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "trainPlanId", unique = true, nullable = false, length = 36)
	public String getTrainPlanId() {
		return this.trainPlanId;
	}

	public void setTrainPlanId(String trainPlanId) {
		this.trainPlanId = trainPlanId;
	}

	@Column(name = "trainDirect", nullable = false, length = 50)
	public String getTrainDirect() {
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect) {
		this.trainDirect = trainDirect;
	}

	@Column(name = "trainObject", nullable = false, length = 50)
	public String getTrainObject() {
		return this.trainObject;
	}

	public void setTrainObject(String trainObject) {
		this.trainObject = trainObject;
	}

	@Column(name = "trainContent", nullable = false, length = 50)
	public String getTrainContent() {
		return this.trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}

	@Column(name = "trainStartTime", nullable = false, length = 23)
	public Timestamp getTrainStartTime() {
		return this.trainStartTime;
	}

	public void setTrainStartTime(Timestamp trainStartTime) {
		this.trainStartTime = trainStartTime;
	}

	@Column(name = "trainContinueTime", nullable = false, length = 50)
	public String getTrainContinueTime() {
		return this.trainContinueTime;
	}

	public void setTrainContinueTime(String trainContinueTime) {
		this.trainContinueTime = trainContinueTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trainPlan")
	public Set<TrainProgram> getTrainPrograms() {
		return this.trainPrograms;
	}

	public void setTrainPrograms(Set<TrainProgram> trainPrograms) {
		this.trainPrograms = trainPrograms;
	}

}