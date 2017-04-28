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

import com.chinasoft.model.entity.TrainEvaluation;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainEvaluation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.TrainEvaluation
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class TrainEvaluationDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainEvaluationDAO.class);
	// property constants
	public static final String TRAIN_LEADER = "trainLeader";
	public static final String TRAIN_DIRECT = "trainDirect";
	public static final String TRAIN_EVALUATION = "trainEvaluation";

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

	public boolean save(TrainEvaluation transientInstance) {
		log.debug("saving TrainEvaluation instance");
		try {
			getCurrentSession().save(transientInstance);
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainEvaluation persistentInstance) {
		log.debug("deleting TrainEvaluation instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainEvaluation findById(java.lang.String id) {
		log.debug("getting TrainEvaluation instance with id: " + id);
		try {
			TrainEvaluation instance = (TrainEvaluation) getCurrentSession()
					.get("com.chinasoft.model.entity.TrainEvaluation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TrainEvaluation> findByExample(TrainEvaluation instance) {
		log.debug("finding TrainEvaluation instance by example");
		try {
			List<TrainEvaluation> results = (List<TrainEvaluation>) getCurrentSession()
					.createCriteria(
							"com.chinasoft.model.entity.TrainEvaluation")
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
		log.debug("finding TrainEvaluation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TrainEvaluation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TrainEvaluation> findByTrainLeader(Object trainLeader) {
		return findByProperty(TRAIN_LEADER, trainLeader);
	}

	public List<TrainEvaluation> findByTrainDirect(Object trainDirect) {
		return findByProperty(TRAIN_DIRECT, trainDirect);
	}

	public List<TrainEvaluation> findByTrainEvaluation(Object trainEvaluation) {
		return findByProperty(TRAIN_EVALUATION, trainEvaluation);
	}

	public List findAll() {
		log.debug("finding all TrainEvaluation instances");
		try {
			String queryString = "from TrainEvaluation";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrainEvaluation merge(TrainEvaluation detachedInstance) {
		log.debug("merging TrainEvaluation instance");
		try {
			TrainEvaluation result = (TrainEvaluation) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainEvaluation instance) {
		log.debug("attaching dirty TrainEvaluation instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainEvaluation instance) {
		log.debug("attaching clean TrainEvaluation instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrainEvaluationDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TrainEvaluationDAO) ctx.getBean("TrainEvaluationDAO");
	}
}