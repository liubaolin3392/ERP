package com.chinasoft.model.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * RecruitInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "recruitInfo", schema = "dbo", catalog = "HRM")
public class RecruitInfo implements java.io.Serializable {

	// Fields

	private String recruitId;
	private String department;
	private String position;
	private Timestamp recruitStartTime;
	private Integer recruitNum;
	private Timestamp recruitEndTime;
	private Timestamp republicTime;

	// Constructors

	/** default constructor */
	public RecruitInfo() {
	}

	/** minimal constructor */
	public RecruitInfo(String department, String position,
			Timestamp recruitStartTime) {
		this.department = department;
		this.position = position;
		this.recruitStartTime = recruitStartTime;
	}

	/** full constructor */
	public RecruitInfo(String department, String position,
			Timestamp recruitStartTime, Integer recruitNum,
			Timestamp recruitEndTime, Timestamp republicTime) {
		this.department = department;
		this.position = position;
		this.recruitStartTime = recruitStartTime;
		this.recruitNum = recruitNum;
		this.recruitEndTime = recruitEndTime;
		this.republicTime = republicTime;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "recruitId", unique = true, nullable = false, length = 36)
	public String getRecruitId() {
		return this.recruitId;
	}

	public void setRecruitId(String recruitId) {
		this.recruitId = recruitId;
	}

	@Column(name = "department", nullable = false, length = 50)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "position", nullable = false, length = 50)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "recruitStartTime", nullable = false, length = 23)
	public Timestamp getRecruitStartTime() {
		return this.recruitStartTime;
	}

	public void setRecruitStartTime(Timestamp recruitStartTime) {
		this.recruitStartTime = recruitStartTime;
	}

	@Column(name = "recruitNum")
	public Integer getRecruitNum() {
		return this.recruitNum;
	}

	public void setRecruitNum(Integer recruitNum) {
		this.recruitNum = recruitNum;
	}

	@Column(name = "recruitEndTime", length = 23)
	public Timestamp getRecruitEndTime() {
		return this.recruitEndTime;
	}

	public void setRecruitEndTime(Timestamp recruitEndTime) {
		this.recruitEndTime = recruitEndTime;
	}

	@Column(name = "republicTime", length = 23)
	public Timestamp getRepublicTime() {
		return this.republicTime;
	}

	public void setRepublicTime(Timestamp republicTime) {
		this.republicTime = republicTime;
	}

}