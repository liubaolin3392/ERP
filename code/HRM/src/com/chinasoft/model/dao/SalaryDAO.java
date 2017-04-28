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

import com.chinasoft.model.entity.Salary;

/**
 * A data access object (DAO) providing persistence and search support for
 * Salary entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.Salary
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class SalaryDAO {
	private static final Logger log = LoggerFactory.getLogger(SalaryDAO.class);
	// property constants
	public static final String BASE_WAGE = "baseWage";
	public static final String HOUSE_FUND = "houseFund";
	public static final String OLDAGE_FUND = "oldageFund";
	public static final String MEDICAL_FUND = "medicalFund";
	public static final String UNEMPLOYMENT_FUND = "unemploymentFund";
	public static final String REIMBURSEMENT = "reimbursement";
	public static final String AWARD = "award";

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

	public void save(Salary transientInstance) {
		log.debug("saving Salary instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Salary persistentInstance) {
		log.debug("deleting Salary instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Salary findById(java.lang.String id) {
		log.debug("getting Salary instance with id: " + id);
		try {
			Salary instance = (Salary) getCurrentSession().get(
					"com.chinasoft.model.entity.Salary", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Salary> findByExample(Salary instance) {
		log.debug("finding Salary instance by example");
		try {
			List<Salary> results = (List<Salary>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.Salary")
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
		log.debug("finding Salary instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Salary as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Salary> findByBaseWage(Object baseWage) {
		return findByProperty(BASE_WAGE, baseWage);
	}

	public List<Salary> findByHouseFund(Object houseFund) {
		return findByProperty(HOUSE_FUND, houseFund);
	}

	public List<Salary> findByOldageFund(Object oldageFund) {
		return findByProperty(OLDAGE_FUND, oldageFund);
	}

	public List<Salary> findByMedicalFund(Object medicalFund) {
		return findByProperty(MEDICAL_FUND, medicalFund);
	}

	public List<Salary> findByUnemploymentFund(Object unemploymentFund) {
		return findByProperty(UNEMPLOYMENT_FUND, unemploymentFund);
	}

	public List<Salary> findByReimbursement(Object reimbursement) {
		return findByProperty(REIMBURSEMENT, reimbursement);
	}

	public List<Salary> findByAward(Object award) {
		return findByProperty(AWARD, award);
	}

	public List findAll() {
		log.debug("finding all Salary instances");
		try {
			String queryString = "from Salary";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Salary merge(Salary detachedInstance) {
		log.debug("merging Salary instance");
		try {
			Salary result = (Salary) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Salary instance) {
		log.debug("attaching dirty Salary instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Salary instance) {
		log.debug("attaching clean Salary instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SalaryDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SalaryDAO) ctx.getBean("SalaryDAO");
	}
}