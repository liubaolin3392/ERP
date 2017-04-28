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

import com.chinasoft.model.entity.PersonnelChange;

/**
 * A data access object (DAO) providing persistence and search support for
 * PersonnelChange entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.PersonnelChange
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class PersonnelChangeDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PersonnelChangeDAO.class);
	// property constants
	public static final String CHANGE_REASON = "changeReason";
	public static final String DONE_MARK = "doneMark";

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

	public void save(PersonnelChange transientInstance) {
		log.debug("saving PersonnelChange instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PersonnelChange persistentInstance) {
		log.debug("deleting PersonnelChange instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PersonnelChange findById(java.lang.String id) {
		log.debug("getting PersonnelChange instance with id: " + id);
		try {
			PersonnelChange instance = (PersonnelChange) getCurrentSession()
					.get("com.chinasoft.model.entity.PersonnelChange", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PersonnelChange> findByExample(PersonnelChange instance) {
		log.debug("finding PersonnelChange instance by example");
		try {
			List<PersonnelChange> results = (List<PersonnelChange>) getCurrentSession()
					.createCriteria(
							"com.chinasoft.model.entity.PersonnelChange")
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
		log.debug("finding PersonnelChange instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from PersonnelChange as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<PersonnelChange> findByChangeReason(Object changeReason) {
		return findByProperty(CHANGE_REASON, changeReason);
	}

	public List<PersonnelChange> findByDoneMark(Object doneMark) {
		return findByProperty(DONE_MARK, doneMark);
	}

	public List findAll() {
		log.debug("finding all PersonnelChange instances");
		try {
			String queryString = "from PersonnelChange";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PersonnelChange merge(PersonnelChange detachedInstance) {
		log.debug("merging PersonnelChange instance");
		try {
			PersonnelChange result = (PersonnelChange) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PersonnelChange instance) {
		log.debug("attaching dirty PersonnelChange instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PersonnelChange instance) {
		log.debug("attaching clean PersonnelChange instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PersonnelChangeDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (PersonnelChangeDAO) ctx.getBean("PersonnelChangeDAO");
	}
}