package com.chinasoft.model.entity;

import java.sql.Timestamp;

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
 * Attendance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "attendance", schema = "dbo", catalog = "HRM")
public class Attendance implements java.io.Serializable {

	// Fields

	private String aid;
	private Employee employee;
	private Integer late;
	private Integer leaveEarly;
	private Integer absent;
	private Integer attendance;
	private Timestamp inTime;
	private Timestamp outTime;
	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** full constructor */
	public Attendance(Employee employee, Integer late, Integer leaveEarly,
			Integer absent, Integer attendance,Timestamp inTime,Timestamp outTime) {
		this.employee = employee;
		this.late = late;
		this.leaveEarly = leaveEarly;
		this.absent = absent;
		this.attendance = attendance;
		this.inTime=inTime;
		this.outTime=outTime;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "guid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "aid", unique = true, nullable = false, length = 36)
	public String getAid() {
		return this.aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eId", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "late", nullable = false)
	public Integer getLate() {
		return this.late;
	}

	public void setLate(Integer late) {
		this.late = late;
	}

	@Column(name = "leaveEarly", nullable = false)
	public Integer getLeaveEarly() {
		return this.leaveEarly;
	}

	public void setLeaveEarly(Integer leaveEarly) {
		this.leaveEarly = leaveEarly;
	}

	@Column(name = "absent", nullable = false)
	public Integer getAbsent() {
		return this.absent;
	}

	public void setAbsent(Integer absent) {
		this.absent = absent;
	}

	@Column(name = "attendance", nullable = false)
	public Integer getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Integer attendance) {
		this.attendance = attendance;
	}

	
	@Column(name = "inTime", nullable = true)
	public Timestamp getInTime() {
		return inTime;
	}

	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}

	@Column(name = "outTime", nullable = true)
	public Timestamp getOutTime() {
		return outTime;
	}

	public void setOutTime(Timestamp outTime) {
		this.outTime = outTime;
	}

}