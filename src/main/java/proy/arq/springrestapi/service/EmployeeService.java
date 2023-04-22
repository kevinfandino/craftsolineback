package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.Employee;

public interface EmployeeService {
	
	//Aca se crea la lista o las listas a usar
	List<Employee> getEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getSingleEmployee (Long id);
	
	void deleteEmployee (Long id);
	
	Employee updateEmployee (Employee employee);

}
