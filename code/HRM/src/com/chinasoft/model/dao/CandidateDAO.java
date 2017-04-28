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

import com.chinasoft.model.entity.Candidate;

/**
 * A data access object (DAO) providing persistence and search support for
 * Candidate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.Candidate
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public class CandidateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CandidateDAO.class);
	// property constants
	public static final String CANDIDATE_NAME = "candidateName";
	public static final String DEPARTMENT = "department";
	public static final String POSITION = "position";
	public static final String CANDIDATE_INFO = "candidateInfo";
	public static final String CANDIDATE_MARK = "candidateMark";

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

	public void save(Candidate transientInstance) {
		log.debug("saving Candidate instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Candidate persistentInstance) {
		log.debug("deleting Candidate instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Candidate findById(java.lang.String id) {
		log.debug("getting Candidate instance with id: " + id);
		try {
			Candidate instance = (Candidate) getCurrentSession().get(
					"com.chinasoft.model.entity.Candidate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Candidate> findByExample(Candidate instance) {
		log.debug("finding Candidate instance by example");
		try {
			List<Candidate> results = (List<Candidate>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.Candidate")
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
		log.debug("finding Candidate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Candidate as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Candidate> findByCandidateName(Object candidateName) {
		return findByProperty(CANDIDATE_NAME, candidateName);
	}

	public List<Candidate> findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List<Candidate> findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List<Candidate> findByCandidateInfo(Object candidateInfo) {
		return findByProperty(CANDIDATE_INFO, candidateInfo);
	}

	public List<Candidate> findByCandidateMark(Object candidateMark) {
		return findByProperty(CANDIDATE_MARK, candidateMark);
	}

	public List findAll() {
		log.debug("finding all Candidate instances");
		try {
			String queryString = "from Candidate";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Candidate merge(Candidate detachedInstance) {
		log.debug("merging Candidate instance");
		try {
			Candidate result = (Candidate) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Candidate instance) {
		log.debug("attaching dirty Candidate instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Candidate instance) {
		log.debug("attaching clean Candidate instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CandidateDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CandidateDAO) ctx.getBean("CandidateDAO");
	}
}