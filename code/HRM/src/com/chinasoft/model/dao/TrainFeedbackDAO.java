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

import com.chinasoft.model.entity.TrainFeedback;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainFeedback entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.TrainFeedback
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class TrainFeedbackDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainFeedbackDAO.class);
	// property constants
	public static final String TRAIN_DIRECT = "trainDirect";
	public static final String TRAIN_FEEDBACK = "trainFeedback";

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

	public void save(TrainFeedback transientInstance) {
		log.debug("saving TrainFeedback instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainFeedback persistentInstance) {
		log.debug("deleting TrainFeedback instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainFeedback findById(java.lang.String id) {
		log.debug("getting TrainFeedback instance with id: " + id);
		try {
			TrainFeedback instance = (TrainFeedback) getCurrentSession().get(
					"com.chinasoft.model.entity.TrainFeedback", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TrainFeedback> findByExample(TrainFeedback instance) {
		log.debug("finding TrainFeedback instance by example");
		try {
			List<TrainFeedback> results = (List<TrainFeedback>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.TrainFeedback")
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
		log.debug("finding TrainFeedback instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TrainFeedback as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TrainFeedback> findByTrainDirect(Object trainDirect) {
		return findByProperty(TRAIN_DIRECT, trainDirect);
	}

	public List<TrainFeedback> findByTrainFeedback(Object trainFeedback) {
		return findByProperty(TRAIN_FEEDBACK, trainFeedback);
	}

	public List findAll() {
		log.debug("finding all TrainFeedback instances");
		try {
			String queryString = "from TrainFeedback";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrainFeedback merge(TrainFeedback detachedInstance) {
		log.debug("merging TrainFeedback instance");
		try {
			TrainFeedback result = (TrainFeedback) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainFeedback instance) {
		log.debug("attaching dirty TrainFeedback instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainFeedback instance) {
		log.debug("attaching clean TrainFeedback instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrainFeedbackDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TrainFeedbackDAO) ctx.getBean("TrainFeedbackDAO");
	}
}