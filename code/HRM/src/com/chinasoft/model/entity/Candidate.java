package com.chinasoft.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Candidate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "candidate", schema = "dbo", catalog = "HRM")
public class Candidate implements java.io.Serializable {

	// Fields

	private String candidateId;
	private String candidateName;
	private String department;
	private String position;
	private String candidateInfo;
	private Integer candidateMark;

	// Constructors

	/** default constructor */
	public Candidate() {
	}

	/** full constructor */
	public Candidate(String candidateName, String department, String position,
			String candidateInfo, Integer candidateMark) {
		this.candidateName = candidateName;
		this.department = department;
		this.position = position;
		this.candidateInfo = candidateInfo;
		this.candidateMark = candidateMark;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "candidateId", unique = true, nullable = false, length = 36)
	public String getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	@Column(name = "candidateName", nullable = false, length = 50)
	public String getCandidateName() {
		return this.candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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

	@Column(name = "candidateInfo", nullable = false, length = 50)
	public String getCandidateInfo() {
		return this.candidateInfo;
	}

	public void setCandidateInfo(String candidateInfo) {
		this.candidateInfo = candidateInfo;
	}

	@Column(name = "candidateMark", nullable = false)
	public Integer getCandidateMark() {
		return this.candidateMark;
	}

	public void setCandidateMark(Integer candidateMark) {
		this.candidateMark = candidateMark;
	}

}