package com.chinasoft.model.dao;

import java.util.List;

import com.chinasoft.model.entity.Attendance;

/**
 * A data access object (DAO) providing persistence and search support for
 * Attendance entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.Attendance
 * @author MyEclipse Persistence Tools
 */
public interface AttendanceMapper
{

	public void save(Attendance transientInstance);

	public void delete(Attendance persistentInstance);

	public Attendance findById(String id);

	public List<Attendance> findAll();
}