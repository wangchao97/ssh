package cn.itcast.service;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import cn.itcast.dao.EmployeeDao;
import cn.itcast.entity.Employee;

public class EmployeeService {
	
	// IOCע��
	private EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * ��ѯ
	 * @param emp
	 */
	public Employee findById(Serializable id) {
		Employee emp = employeeDao.findById(id);
		return emp;
	}
}
