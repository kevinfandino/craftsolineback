package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.Employee;
import proy.arq.springrestapi.repository.EmployeeRepository;


@Service
public class ServiceEmployeeImp implements EmployeeService {

	//Aca se agregan los datos a llenar en la lista
	//Los cuales son mostrados al momento de hacer el request
	/*	private static List<Employee> list = new ArrayList<>();
	
	static {
		Employee e = new Employee();
		e.setName("Diego");
		e.setAge(25);
		e.setDepartment("Estudiante");
		e.setEmail("daroa00@ucatolica.edu.co");
		e.setLocation("Colombia");
		list.add(e);
		
		e = new Employee();
		e.setName("Natalia");
		e.setAge(24L);
		e.setDepartment("Estudiante");
		e.setEmail("kath@gmail.com");
		e.setLocation("Colombia");
		list.add(e);
	} */
	
	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public List<Employee> getEmployees() {
		
		return eRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
		
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		Optional<Employee> employee = eRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Empleado no encontrado con el id " +id);
		

	}

	@Override
	public void deleteEmployee(Long id) {
		
		eRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return eRepository.save(employee);
	}
	

}
