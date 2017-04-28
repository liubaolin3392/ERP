package com.chinasoft.model.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */
public class Employee implements java.io.Serializable
{

	// Fields

	private String eid;
	private String userId;
	private String userName;
	private String department;
	private String position;
	private String password;
	private String phone;
	private Integer userLevel;
	private Integer age;
	private String sex;
	private Set<Contract> contracts = new HashSet<Contract>(0);
	private Set<TrainFeedback> trainFeedbacks = new HashSet<TrainFeedback>(0);
	private Set<PersonnelChange> personnelChanges = new HashSet<PersonnelChange>(0);
	private Set<Salary> salaries = new HashSet<Salary>(0);
	private Set<Attendance> attendances = new HashSet<Attendance>(0);
	private Set<TrainApply> trainApplies = new HashSet<TrainApply>(0);
	private Set<TrainEvaluation> trainEvaluations = new HashSet<TrainEvaluation>(0);

	// Constructors

	/** default constructor */
	public Employee()
	{
	}

	/** minimal constructor */
	public Employee(String userId, String userName, String department, String position, String password,
			Integer userLevel)
	{
		this.userId = userId;
		this.userName = userName;
		this.department = department;
		this.position = position;
		this.password = password;
		this.userLevel = userLevel;
	}

	/** full constructor */
	public Employee(String userId, String userName, String department, String position, String password, String phone,
			Integer userLevel, Integer age, String sex, Set<Contract> contracts, Set<TrainFeedback> trainFeedbacks,
			Set<PersonnelChange> personnelChanges, Set<Salary> salaries, Set<Attendance> attendances,
			Set<TrainApply> trainApplies, Set<TrainEvaluation> trainEvaluations)
	{
		this.userId = userId;
		this.userName = userName;
		this.department = department;
		this.position = position;
		this.password = password;
		this.phone = phone;
		this.userLevel = userLevel;
		this.age = age;
		this.sex = sex;
		this.contracts = contracts;
		this.trainFeedbacks = trainFeedbacks;
		this.personnelChanges = personnelChanges;
		this.salaries = salaries;
		this.attendances = attendances;
		this.trainApplies = trainApplies;
		this.trainEvaluations = trainEvaluations;
	}

	// Property accessors
	public String getEid()
	{
		return this.eid;
	}

	public void setEid(String eid)
	{
		this.eid = eid;
	}

	public String getUserId()
	{
		return this.userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getDepartment()
	{
		return this.department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getPosition()
	{
		return this.position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public Integer getUserLevel()
	{
		return this.userLevel;
	}

	public void setUserLevel(Integer userLevel)
	{
		this.userLevel = userLevel;
	}

	public Integer getAge()
	{
		return this.age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public Set<Contract> getContracts()
	{
		return this.contracts;
	}

	public void setContracts(Set<Contract> contracts)
	{
		this.contracts = contracts;
	}

	public Set<TrainFeedback> getTrainFeedbacks()
	{
		return this.trainFeedbacks;
	}

	public void setTrainFeedbacks(Set<TrainFeedback> trainFeedbacks)
	{
		this.trainFeedbacks = trainFeedbacks;
	}

	public Set<PersonnelChange> getPersonnelChanges()
	{
		return this.personnelChanges;
	}

	public void setPersonnelChanges(Set<PersonnelChange> personnelChanges)
	{
		this.personnelChanges = personnelChanges;
	}

	public Set<Salary> getSalaries()
	{
		return this.salaries;
	}

	public void setSalaries(Set<Salary> salaries)
	{
		this.salaries = salaries;
	}

	public Set<Attendance> getAttendances()
	{
		return this.attendances;
	}

	public void setAttendances(Set<Attendance> attendances)
	{
		this.attendances = attendances;
	}

	public Set<TrainApply> getTrainApplies()
	{
		return this.trainApplies;
	}

	public void setTrainApplies(Set<TrainApply> trainApplies)
	{
		this.trainApplies = trainApplies;
	}

	public Set<TrainEvaluation> getTrainEvaluations()
	{
		return this.trainEvaluations;
	}

	public void setTrainEvaluations(Set<TrainEvaluation> trainEvaluations)
	{
		this.trainEvaluations = trainEvaluations;
	}

}