package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeRepository;

	@Override
	public Employee getEmployee(Long id) {
		
		return employeRepository.getOne(id);
	}

	@Override
	public Long insertEmployee(Employee employe) {
		// TODO Auto-generated method stub
		return employeRepository.save(employe).getId();
	}

	@Override
	public boolean updateEmployee(Employee employe) {
		// TODO Auto-generated method stub
		Employee emp=employeRepository.getOne(employe.getId());
		if(emp!=null) {
			emp.setFirstname(employe.getFirstname());
			emp.setLastname(employe.getLastname());
			emp.setBirthdate(employe.getBirthdate());
			emp.setSalary(employe.getSalary());
			employeRepository.save(emp);
			return true;
			
		}else return false;
		
	}

	@Override
	public boolean deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(id);
		employeRepository.delete(e);
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	@Override
	public List<Employee> findBySalary() {
		return employeRepository.findBySalary();
	}
	
	

}
