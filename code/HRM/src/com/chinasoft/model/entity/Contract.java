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
 * Contract entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Contract", schema = "dbo", catalog = "HRM")
public class Contract implements java.io.Serializable {

	// Fields

	private String contractId;
	private Employee employee;
	private String contractName;
	private String contractType;
	private String contractContect;

	// Constructors

	/** default constructor */
	public Contract() {
	}

	/** full constructor */
	public Contract(Employee employee, String contractName,
			String contractType, String contractContect) {
		this.employee = employee;
		this.contractName = contractName;
		this.contractType = contractType;
		this.contractContect = contractContect;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "contractId", unique = true, nullable = false, length = 36)
	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eId", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "contractName", nullable = false, length = 50)
	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@Column(name = "contractType", nullable = false, length = 50)
	public String getContractType() {
		return this.contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	@Column(name = "contractContect", nullable = false, length = 8000)
	public String getContractContect() {
		return this.contractContect;
	}

	public void setContractContect(String contractContect) {
		this.contractContect = contractContect;
	}

}