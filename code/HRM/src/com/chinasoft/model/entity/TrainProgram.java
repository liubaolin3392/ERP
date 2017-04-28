package com.chinasoft.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TrainProgram entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trainProgram", schema = "dbo", catalog = "HRM")
public class TrainProgram implements java.io.Serializable {

	// Fields

	private String trainProgramId;
	private TrainPlan trainPlan;
	private String trainPlace;
	private String trainInfo;
	private Double trainPrice;

	// Constructors

	/** default constructor */
	public TrainProgram() {
	}

	/** full constructor */
	public TrainProgram(TrainPlan trainPlan, String trainPlace,
			String trainInfo, Double trainPrice) {
		this.trainPlan = trainPlan;
		this.trainPlace = trainPlace;
		this.trainInfo = trainInfo;
		this.trainPrice = trainPrice;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "trainProgramId", unique = true, nullable = false, length = 32)
	public String getTrainProgramId() {
		return this.trainProgramId;
	}

	public void setTrainProgramId(String trainProgramId) {
		this.trainProgramId = trainProgramId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainPlanID", nullable = false)
	public TrainPlan getTrainPlan() {
		return this.trainPlan;
	}

	public void setTrainPlan(TrainPlan trainPlan) {
		this.trainPlan = trainPlan;
	}

	@Column(name = "trainPlace", nullable = false, length = 50)
	public String getTrainPlace() {
		return this.trainPlace;
	}

	public void setTrainPlace(String trainPlace) {
		this.trainPlace = trainPlace;
	}

	@Column(name = "trainInfo", nullable = false, length = 50)
	public String getTrainInfo() {
		return this.trainInfo;
	}

	public void setTrainInfo(String trainInfo) {
		this.trainInfo = trainInfo;
	}

	@Column(name = "trainPrice", nullable = false, precision = 18)
	public Double getTrainPrice() {
		return this.trainPrice;
	}

	public void setTrainPrice(Double trainPrice) {
		this.trainPrice = trainPrice;
	}

}