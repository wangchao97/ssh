package cn.itcast.action;

import java.util.Map;

import cn.itcast.entity.Employee;
import cn.itcast.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class EmployeeAction extends ActionSupport{
	
	// IOC����ע��
	private EmployeeService employeeService;
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	public String execute(){
		int empid = 17;
		// ����Service
		Employee emp = employeeService.findById(empid);
		// ���浽request
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("emp", emp);
		
		return SUCCESS;
	}
}