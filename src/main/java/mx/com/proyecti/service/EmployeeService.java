package mx.com.proyecti.service;

import java.util.List;

import mx.com.proyecti.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(Long id);
	public Long insertEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Long id);
	public List<Employee> getAllEmployee();
	public List<Employee> findBySalary();
	

}
