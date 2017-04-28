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

import com.chinasoft.model.entity.TrainApply;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainApply entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.TrainApply
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class TrainApplyDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainApplyDAO.class);
	// property constants
	public static final String TRAIN_DIRECT = "trainDirect";
	public static final String TRAIN_LEADER = "trainLeader";
	public static final String TRAIN_MARK = "trainMark";

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

	public boolean save(TrainApply transientInstance) {
		log.debug("saving TrainApply instance");
		try {
			getCurrentSession().save(transientInstance);
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainApply persistentInstance) {
		log.debug("deleting TrainApply instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainApply findById(java.lang.String id) {
		log.debug("getting TrainApply instance with id: " + id);
		try {
			TrainApply instance = (TrainApply) getCurrentSession().get(
					"com.chinasoft.model.entity.TrainApply", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TrainApply> findByExample(TrainApply instance) {
		log.debug("finding TrainApply instance by example");
		try {
			List<TrainApply> results = (List<TrainApply>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.TrainApply")
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
		log.debug("finding TrainApply instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrainApply as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TrainApply> findByTrainDirect(Object trainDirect) {
		return findByProperty(TRAIN_DIRECT, trainDirect);
	}

	public List<TrainApply> findByTrainLeader(Object trainLeader) {
		return findByProperty(TRAIN_LEADER, trainLeader);
	}

	public List<TrainApply> findByTrainMark(Object trainMark) {
		return findByProperty(TRAIN_MARK, trainMark);
	}

	public List findAll() {
		log.debug("finding all TrainApply instances");
		try {
			String queryString = "from TrainApply";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrainApply merge(TrainApply detachedInstance) {
		log.debug("merging TrainApply instance");
		try {
			TrainApply result = (TrainApply) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainApply instance) {
		log.debug("attaching dirty TrainApply instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainApply instance) {
		log.debug("attaching clean TrainApply instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrainApplyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TrainApplyDAO) ctx.getBean("TrainApplyDAO");
	}
}