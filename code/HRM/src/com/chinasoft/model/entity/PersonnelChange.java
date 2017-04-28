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
 * PersonnelChange entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "personnelChange", schema = "dbo", catalog = "HRM")
public class PersonnelChange implements java.io.Serializable {

	// Fields

	private String pcId;
	private Employee employee;
	private String changeReason;
	private Integer doneMark;

	// Constructors

	/** default constructor */
	public PersonnelChange() {
	}

	/** full constructor */
	public PersonnelChange(Employee employee, String changeReason,
			Integer doneMark) {
		this.employee = employee;
		this.changeReason = changeReason;
		this.doneMark = doneMark;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "pcId", unique = true, nullable = false, length = 36)
	public String getPcId() {
		return this.pcId;
	}

	public void setPcId(String pcId) {
		this.pcId = pcId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eId", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "changeReason", nullable = false, length = 80)
	public String getChangeReason() {
		return this.changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	@Column(name = "doneMark", nullable = false)
	public Integer getDoneMark() {
		return this.doneMark;
	}

	public void setDoneMark(Integer doneMark) {
		this.doneMark = doneMark;
	}

}