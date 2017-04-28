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
 * Salary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "salary", schema = "dbo", catalog = "HRM")
public class Salary implements java.io.Serializable {

	// Fields

	private String sid;
	private Employee employee;
	private Double baseWage;
	private Double houseFund;
	private Double oldageFund;
	private Double medicalFund;
	private Double unemploymentFund;
	private Double reimbursement;
	private Double award;

	// Constructors

	/** default constructor */
	public Salary() {
	}

	/** full constructor */
	public Salary(Employee employee, Double baseWage, Double houseFund,
			Double oldageFund, Double medicalFund, Double unemploymentFund,
			Double reimbursement, Double award) {
		this.employee = employee;
		this.baseWage = baseWage;
		this.houseFund = houseFund;
		this.oldageFund = oldageFund;
		this.medicalFund = medicalFund;
		this.unemploymentFund = unemploymentFund;
		this.reimbursement = reimbursement;
		this.award = award;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "sId", unique = true, nullable = false, length = 36)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eid", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "baseWage", nullable = false, precision = 18)
	public Double getBaseWage() {
		return this.baseWage;
	}

	public void setBaseWage(Double baseWage) {
		this.baseWage = baseWage;
	}

	@Column(name = "houseFund", nullable = false, precision = 18)
	public Double getHouseFund() {
		return this.houseFund;
	}

	public void setHouseFund(Double houseFund) {
		this.houseFund = houseFund;
	}

	@Column(name = "oldageFund", nullable = false, precision = 18)
	public Double getOldageFund() {
		return this.oldageFund;
	}

	public void setOldageFund(Double oldageFund) {
		this.oldageFund = oldageFund;
	}

	@Column(name = "medicalFund", nullable = false, precision = 18)
	public Double getMedicalFund() {
		return this.medicalFund;
	}

	public void setMedicalFund(Double medicalFund) {
		this.medicalFund = medicalFund;
	}

	@Column(name = "unemploymentFund", nullable = false, precision = 18)
	public Double getUnemploymentFund() {
		return this.unemploymentFund;
	}

	public void setUnemploymentFund(Double unemploymentFund) {
		this.unemploymentFund = unemploymentFund;
	}

	@Column(name = "reimbursement", nullable = false, precision = 18)
	public Double getReimbursement() {
		return this.reimbursement;
	}

	public void setReimbursement(Double reimbursement) {
		this.reimbursement = reimbursement;
	}

	@Column(name = "award", nullable = false, precision = 18)
	public Double getAward() {
		return this.award;
	}

	public void setAward(Double award) {
		this.award = award;
	}

}