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

import com.chinasoft.model.entity.Contract;

/**
 * A data access object (DAO) providing persistence and search support for
 * Contract entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.Contract
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class ContractDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ContractDAO.class);
	// property constants
	public static final String CONTRACT_NAME = "contractName";
	public static final String CONTRACT_TYPE = "contractType";
	public static final String CONTRACT_CONTECT = "contractContect";

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

	public void save(Contract transientInstance) {
		log.debug("saving Contract instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Contract persistentInstance) {
		log.debug("deleting Contract instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Contract findById(java.lang.String id) {
		log.debug("getting Contract instance with id: " + id);
		try {
			Contract instance = (Contract) getCurrentSession().get(
					"com.chinasoft.model.entity.Contract", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Contract> findByExample(Contract instance) {
		log.debug("finding Contract instance by example");
		try {
			List<Contract> results = (List<Contract>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.Contract")
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
		log.debug("finding Contract instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Contract as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Contract> findByContractName(Object contractName) {
		return findByProperty(CONTRACT_NAME, contractName);
	}

	public List<Contract> findByContractType(Object contractType) {
		return findByProperty(CONTRACT_TYPE, contractType);
	}

	public List<Contract> findByContractContect(Object contractContect) {
		return findByProperty(CONTRACT_CONTECT, contractContect);
	}

	public List findAll() {
		log.debug("finding all Contract instances");
		try {
			String queryString = "from Contract";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Contract merge(Contract detachedInstance) {
		log.debug("merging Contract instance");
		try {
			Contract result = (Contract) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Contract instance) {
		log.debug("attaching dirty Contract instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Contract instance) {
		log.debug("attaching clean Contract instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ContractDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ContractDAO) ctx.getBean("ContractDAO");
	}
}