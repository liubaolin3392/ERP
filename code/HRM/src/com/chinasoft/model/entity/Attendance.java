package com.chinasoft.model.entity;

import java.sql.Timestamp;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */
public class Attendance implements java.io.Serializable
{

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
	public Attendance()
	{
	}

	/** full constructor */
	public Attendance(Employee employee, Integer late, Integer leaveEarly, Integer absent, Integer attendance,
			Timestamp inTime, Timestamp outTime)
	{
		this.employee = employee;
		this.late = late;
		this.leaveEarly = leaveEarly;
		this.absent = absent;
		this.attendance = attendance;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public String getAid()
	{
		return this.aid;
	}

	public void setAid(String aid)
	{
		this.aid = aid;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public Integer getLate()
	{
		return this.late;
	}

	public void setLate(Integer late)
	{
		this.late = late;
	}

	public Integer getLeaveEarly()
	{
		return this.leaveEarly;
	}

	public void setLeaveEarly(Integer leaveEarly)
	{
		this.leaveEarly = leaveEarly;
	}

	public Integer getAbsent()
	{
		return this.absent;
	}

	public void setAbsent(Integer absent)
	{
		this.absent = absent;
	}

	public Integer getAttendance()
	{
		return this.attendance;
	}

	public void setAttendance(Integer attendance)
	{
		this.attendance = attendance;
	}

	public Timestamp getInTime()
	{
		return inTime;
	}

	public void setInTime(Timestamp inTime)
	{
		this.inTime = inTime;
	}

	public Timestamp getOutTime()
	{
		return outTime;
	}

	public void setOutTime(Timestamp outTime)
	{
		this.outTime = outTime;
	}

}