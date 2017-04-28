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
 * TrainApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trainApply", schema = "dbo", catalog = "HRM")
public class TrainApply implements java.io.Serializable {

	// Fields

	private String trainApplyId;
	private Employee employee;
	private String trainDirect;
	private String trainLeader;
	private Integer trainMark;

	// Constructors

	/** default constructor */
	public TrainApply() {
	}

	/** full constructor */
	public TrainApply(Employee employee, String trainDirect,
			String trainLeader, Integer trainMark) {
		this.employee = employee;
		this.trainDirect = trainDirect;
		this.trainLeader = trainLeader;
		this.trainMark = trainMark;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "trainApplyId", unique = true, nullable = false, length = 36)
	public String getTrainApplyId() {
		return this.trainApplyId;
	}

	public void setTrainApplyId(String trainApplyId) {
		this.trainApplyId = trainApplyId;
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

	@Column(name = "trainLeader", nullable = false, length = 50)
	public String getTrainLeader() {
		return this.trainLeader;
	}

	public void setTrainLeader(String trainLeader) {
		this.trainLeader = trainLeader;
	}

	@Column(name = "trainMark", nullable = false)
	public Integer getTrainMark() {
		return this.trainMark;
	}

	public void setTrainMark(Integer trainMark) {
		this.trainMark = trainMark;
	}

}