package com.chinasoft.model.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

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

import com.chinasoft.model.entity.TrainPlan;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainPlan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.TrainPlan
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class TrainPlanDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainPlanDAO.class);
	// property constants
	public static final String TRAIN_DIRECT = "trainDirect";
	public static final String TRAIN_OBJECT = "trainObject";
	public static final String TRAIN_CONTENT = "trainContent";
	public static final String TRAIN_CONTINUE_TIME = "trainContinueTime";

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

	public void save(TrainPlan transientInstance) {
		log.debug("saving TrainPlan instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainPlan persistentInstance) {
		log.debug("deleting TrainPlan instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainPlan findById(java.lang.String id) {
		log.debug("getting TrainPlan instance with id: " + id);
		try {
			TrainPlan instance = (TrainPlan) getCurrentSession().get(
					"com.chinasoft.model.entity.TrainPlan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TrainPlan> findByExample(TrainPlan instance) {
		log.debug("finding TrainPlan instance by example");
		try {
			List<TrainPlan> results = (List<TrainPlan>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.TrainPlan")
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
		log.debug("finding TrainPlan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrainPlan as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TrainPlan> findByTrainDirect(Object trainDirect) {
		return findByProperty(TRAIN_DIRECT, trainDirect);
	}

	public List<TrainPlan> findByTrainObject(Object trainObject) {
		return findByProperty(TRAIN_OBJECT, trainObject);
	}

	public List<TrainPlan> findByTrainContent(Object trainContent) {
		return findByProperty(TRAIN_CONTENT, trainContent);
	}

	public List<TrainPlan> findByTrainContinueTime(Object trainContinueTime) {
		return findByProperty(TRAIN_CONTINUE_TIME, trainContinueTime);
	}

	public List findAll() {
		log.debug("finding all TrainPlan instances");
		try {
			String queryString = "from TrainPlan";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

//	通过三个参数模糊查询
	public List<TrainPlan> findbyparam(String trainObject,String trainDirect,String trainContent){
		log.debug("finding check TrainPlan instances");
		try {
				Query queryObject = getCurrentSession().createQuery("from TrainPlan t where t.trainObject=? and t.trainDirect like ? and t.trainContent like ?")
																							.setString(0, trainObject)
																							.setString(1, "%"+trainDirect+"%")
																							.setString(2, "%"+trainContent+"%");
				return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find check failed", re);
			throw re;
		}		
	}
	
	
	public TrainPlan merge(TrainPlan detachedInstance) {
		log.debug("merging TrainPlan instance");
		try {
			TrainPlan result = (TrainPlan) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainPlan instance) {
		log.debug("attaching dirty TrainPlan instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainPlan instance) {
		log.debug("attaching clean TrainPlan instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrainPlanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TrainPlanDAO) ctx.getBean("TrainPlanDAO");
	}
}