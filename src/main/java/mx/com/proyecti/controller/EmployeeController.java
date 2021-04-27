package mx.com.proyecti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {
	
	//1.-buca dentro de las clases publicadas para encontrar la definicion de la clase EmployeService
	@Autowired
	private EmployeeService employeeService;
	
	//crear los metodos de mis servicios(operaciones) de mi servicio web REST
	
	@GetMapping("/employees") // utilizar operacion http get
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employees") //utilizar operacion http post
	Long insertEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@GetMapping("/employees/{id}") 
	Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/employees")
	Boolean updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	
	}
	
	@DeleteMapping("/employees/{id}")
	Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	
	}


}
