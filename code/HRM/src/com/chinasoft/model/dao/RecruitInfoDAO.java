package com.chinasoft.model.dao;

import java.sql.Timestamp;
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

import com.chinasoft.model.entity.RecruitInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * RecruitInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.RecruitInfo
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class RecruitInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RecruitInfoDAO.class);
	// property constants
	public static final String DEPARTMENT = "department";
	public static final String POSITION = "position";
	public static final String RECRUIT_NUM = "recruitNum";

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

	public void save(RecruitInfo transientInstance) {
		log.debug("saving RecruitInfo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RecruitInfo persistentInstance) {
		log.debug("deleting RecruitInfo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RecruitInfo findById(java.lang.String id) {
		log.debug("getting RecruitInfo instance with id: " + id);
		try {
			RecruitInfo instance = (RecruitInfo) getCurrentSession().get(
					"com.chinasoft.model.entity.RecruitInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<RecruitInfo> findByExample(RecruitInfo instance) {
		log.debug("finding RecruitInfo instance by example");
		try {
			List<RecruitInfo> results = (List<RecruitInfo>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.RecruitInfo")
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
		log.debug("finding RecruitInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RecruitInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<RecruitInfo> findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List<RecruitInfo> findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List<RecruitInfo> findByRecruitNum(Object recruitNum) {
		return findByProperty(RECRUIT_NUM, recruitNum);
	}

	public List findAll() {
		log.debug("finding all RecruitInfo instances");
		try {
			String queryString = "from RecruitInfo";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RecruitInfo merge(RecruitInfo detachedInstance) {
		log.debug("merging RecruitInfo instance");
		try {
			RecruitInfo result = (RecruitInfo) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RecruitInfo instance) {
		log.debug("attaching dirty RecruitInfo instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RecruitInfo instance) {
		log.debug("attaching clean RecruitInfo instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RecruitInfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (RecruitInfoDAO) ctx.getBean("RecruitInfoDAO");
	}
}