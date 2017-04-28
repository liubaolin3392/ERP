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
 * TrainEvaluation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trainEvaluation", schema = "dbo", catalog = "HRM")
public class TrainEvaluation implements java.io.Serializable {

	// Fields

	private String trainEvaId;
	private Employee employee;
	private String trainLeader;
	private String trainDirect;
	private String trainEvaluation;

	// Constructors

	/** default constructor */
	public TrainEvaluation() {
	}

	/** full constructor */
	public TrainEvaluation(Employee employee, String trainLeader,
			String trainDirect, String trainEvaluation) {
		this.employee = employee;
		this.trainLeader = trainLeader;
		this.trainDirect = trainDirect;
		this.trainEvaluation = trainEvaluation;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "trainEvaId", unique = true, nullable = false, length = 36)
	public String getTrainEvaId() {
		return this.trainEvaId;
	}

	public void setTrainEvaId(String trainEvaId) {
		this.trainEvaId = trainEvaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eId", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "trainLeader", nullable = false, length = 50)
	public String getTrainLeader() {
		return this.trainLeader;
	}

	public void setTrainLeader(String trainLeader) {
		this.trainLeader = trainLeader;
	}

	@Column(name = "trainDirect", nullable = false, length = 50)
	public String getTrainDirect() {
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect) {
		this.trainDirect = trainDirect;
	}

	@Column(name = "trainEvaluation", nullable = false, length = 50)
	public String getTrainEvaluation() {
		return this.trainEvaluation;
	}

	public void setTrainEvaluation(String trainEvaluation) {
		this.trainEvaluation = trainEvaluation;
	}

}