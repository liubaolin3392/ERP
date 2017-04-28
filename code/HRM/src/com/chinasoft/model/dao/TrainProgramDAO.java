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

import com.chinasoft.model.entity.TrainProgram;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainProgram entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.TrainProgram
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class TrainProgramDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainProgramDAO.class);
	// property constants
	public static final String TRAIN_PLACE = "trainPlace";
	public static final String TRAIN_INFO = "trainInfo";
	public static final String TRAIN_PRICE = "trainPrice";

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

	public void save(TrainProgram transientInstance) {
		log.debug("saving TrainProgram instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainProgram persistentInstance) {
		log.debug("deleting TrainProgram instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainProgram findById(java.lang.String id) {
		log.debug("getting TrainProgram instance with id: " + id);
		try {
			TrainProgram instance = (TrainProgram) getCurrentSession().get(
					"com.chinasoft.model.entity.TrainProgram", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TrainProgram> findByExample(TrainProgram instance) {
		log.debug("finding TrainProgram instance by example");
		try {
			List<TrainProgram> results = (List<TrainProgram>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.TrainProgram")
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
		log.debug("finding TrainProgram instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TrainProgram as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TrainProgram> findByTrainPlace(Object trainPlace) {
		return findByProperty(TRAIN_PLACE, trainPlace);
	}

	public List<TrainProgram> findByTrainInfo(Object trainInfo) {
		return findByProperty(TRAIN_INFO, trainInfo);
	}

	public List<TrainProgram> findByTrainPrice(Object trainPrice) {
		return findByProperty(TRAIN_PRICE, trainPrice);
	}

	public List findAll() {
		log.debug("finding all TrainProgram instances");
		try {
			String queryString = "from TrainProgram";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrainProgram merge(TrainProgram detachedInstance) {
		log.debug("merging TrainProgram instance");
		try {
			TrainProgram result = (TrainProgram) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainProgram instance) {
		log.debug("attaching dirty TrainProgram instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainProgram instance) {
		log.debug("attaching clean TrainProgram instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrainProgramDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TrainProgramDAO) ctx.getBean("TrainProgramDAO");
	}
}