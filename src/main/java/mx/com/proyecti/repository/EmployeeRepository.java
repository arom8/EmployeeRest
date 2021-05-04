package mx.com.proyecti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.proyecti.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query(value="SELECT * FROM Employee where salary<11000",nativeQuery=true)
	List<Employee> findBySalary();

}
