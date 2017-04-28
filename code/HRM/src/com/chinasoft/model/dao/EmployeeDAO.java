package com.chinasoft.model.dao;

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

import com.chinasoft.model.entity.Employee;

/**
 * A data access object (DAO) providing persistence and search support for
 * Employee entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasoft.model.entity.Employee
 * @author MyEclipse Persistence Tools
 */
@Repository
public class EmployeeDAO {
	private static final Logger log = LoggerFactory
			.getLogger(EmployeeDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String USER_NAME = "userName";
	public static final String DEPARTMENT = "department";
	public static final String POSITION = "position";
	public static final String PASSWORD = "password";
	public static final String PHONE = "phone";
	public static final String USER_LEVEL = "userLevel";
	public static final String AGE = "age";
	public static final String SEX = "sex";

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

	public boolean save(Employee transientInstance) {
		log.debug("saving Employee instance");
		try {
			getCurrentSession().save(transientInstance);
			return true;
		} catch (RuntimeException re) {
			return false;
		}
	}

	public boolean delete(Employee persistentInstance) {
		log.debug("deleting Employee instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
			return true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Employee findById(java.lang.String id) {
		log.debug("getting Employee instance with id: " + id);
		try {
			Employee instance = (Employee) getCurrentSession().get(
					"com.chinasoft.model.entity.Employee", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Employee> findByExample(Employee instance) {
		log.debug("finding Employee instance by example");
		try {
			List<Employee> results = (List<Employee>) getCurrentSession()
					.createCriteria("com.chinasoft.model.entity.Employee")
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
		log.debug("finding Employee instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Employee as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Employee> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<Employee> findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List<Employee> findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List<Employee> findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List<Employee> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<Employee> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<Employee> findByUserLevel(Object userLevel) {
		return findByProperty(USER_LEVEL, userLevel);
	}

	public List<Employee> findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List<Employee> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findAll() {
		log.debug("finding all Employee instances");
		try {
			String queryString = "from Employee";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

//	用户登录
	public Employee checkLogin(Employee employee){
		log.debug("check Login instance");
		try {
			String queryString = "from Employee e where e.userId = ? and e.password=? and e.userLevel=?";
			Query queryObject = getCurrentSession().createQuery(queryString)
														.setString(0, employee.getUserId())
														.setString(1, employee.getPassword())
														.setInteger(2, employee.getUserLevel());		
			return (Employee)queryObject.uniqueResult();
		}catch (RuntimeException re) {
			log.error("check Login failed", re);
			throw re;
		}
	}
	
// 	模糊查询
	public List<Employee> searchEmployees(String userName, String department, String position, Integer age, String  sex ){
		
		log.debug("search instance");
		Query queryObject = null;
		String queryString = "";
		try {
			if (age==null || age==0) {
				 queryString = "from Employee e where e.userName like ? and e.department like ? and e.position like ? and e.sex like ?";
				 queryObject = getCurrentSession().createQuery(queryString)
															.setString(0, "%"+userName+"%")
															.setString(1, "%"+department+"%")
															.setString(2, "%"+position+"%")
															.setString(3, "%"+sex+"%");
			}else {
				 queryString = "from Employee e where e.userName like ? and e.department like ? and e.position like ? and e.age = ? and e.sex like ?";
				 queryObject = getCurrentSession().createQuery(queryString)
															.setString(0, "%"+userName+"%")
															.setString(1, "%"+department+"%")
															.setString(2, "%"+position+"%")
															.setInteger(3, age)
															.setString(4, "%"+sex+"%");
			}
					
			return queryObject.list();
		}catch (RuntimeException re) {
			log.error("check Login failed", re);
			throw re;
		}
	}
		
	
	public Employee merge(Employee detachedInstance) {
		log.debug("merging Employee instance");
		try {
			Employee result = (Employee) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public boolean attachDirty(Employee instance) {
		log.debug("attaching dirty Employee instance");
		try {
			getCurrentSession().saveOrUpdate(instance);	
			log.debug("attach successful");
			return true;
		} catch (RuntimeException re) {
			log.error("attaching  failed", re);
			throw re;
		}	
	}

	public void attachClean(Employee instance) {
		log.debug("attaching clean Employee instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmployeeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmployeeDAO) ctx.getBean("EmployeeDAO");
	}
}