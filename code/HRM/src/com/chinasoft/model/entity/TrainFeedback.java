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
 * TrainFeedback entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trainFeedback", schema = "dbo", catalog = "HRM")
public class TrainFeedback implements java.io.Serializable {

	// Fields

	private String trainFeedbackId;
	private Employee employee;
	private String trainDirect;
	private String trainFeedback;

	// Constructors

	/** default constructor */
	public TrainFeedback() {
	}

	/** minimal constructor */
	public TrainFeedback(Employee employee, String trainDirect) {
		this.employee = employee;
		this.trainDirect = trainDirect;
	}

	/** full constructor */
	public TrainFeedback(Employee employee, String trainDirect,
			String trainFeedback) {
		this.employee = employee;
		this.trainDirect = trainDirect;
		this.trainFeedback = trainFeedback;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "trainFeedbackId", unique = true, nullable = false, length = 36)
	public String getTrainFeedbackId() {
		return this.trainFeedbackId;
	}

	public void setTrainFeedbackId(String trainFeedbackId) {
		this.trainFeedbackId = trainFeedbackId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eId", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "trainDirect", nullable = false, length = 50)
	public String getTrainDirect() {
		return this.trainDirect;
	}

	public void setTrainDirect(String trainDirect) {
		this.trainDirect = trainDirect;
	}

	@Column(name = "trainFeedback", length = 50)
	public String getTrainFeedback() {
		return this.trainFeedback;
	}

	public void setTrainFeedback(String trainFeedback) {
		this.trainFeedback = trainFeedback;
	}

}