package com.chinasoft.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
@Repository
@Transactional
public class AttendanceDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AttendanceDAO.class);
	// property constants
	public static final String LATE = "late";
	public static final String LEAVE_EARLY = "leaveEarly";
	public static final String ABSENT = "absent";
	public static final String ATTENDANCE = "attendance";
	public static final String INTIME = "inTime";
	public static final String OUTTIME = "outTime";
	
	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Attendance transientInstance) {
		log.debug("saving Attendance instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Attendance persistentInstance) {
		log.debug("deleting Attendance instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Attendance findById(java.lang.String id) {
		log.debug("getting Attendance instance with id: " + id);
		try {
			Attendance instance = (Attendance) getCurrentSession().get(
					"com.chinasoft.model.entity.Attendance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Attendance> findByExample(Attendance instance) {
		log.debug("finding Attendance instance by example");
		try {
			List<Attendance> results = (List<Attendance>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.Attendance")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Attendance instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Attendance as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Attendance> findByLate(Object late) {
		return findByProperty(LATE, late);
	}

	public List<Attendance> findByLeaveEarly(Object leaveEarly) {
		return findByProperty(LEAVE_EARLY, leaveEarly);
	}

	public List<Attendance> findByAbsent(Object absent) {
		return findByProperty(ABSENT, absent);
	}

	public List<Attendance> findByAttendance(Object attendance) {
		return findByProperty(ATTENDANCE, attendance);
	}

	public List findAll() {
		log.debug("finding all Attendance instances");
		try {
			String queryString = "from Attendance";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Attendance merge(Attendance detachedInstance) {
		log.debug("merging Attendance instance");
		try {
			Attendance result = (Attendance) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Attendance instance) {
		log.debug("attaching dirty Attendance instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Attendance instance) {
		log.debug("attaching clean Attendance instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AttendanceDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AttendanceDAO) ctx.getBean("AttendanceDAO");
	}
}