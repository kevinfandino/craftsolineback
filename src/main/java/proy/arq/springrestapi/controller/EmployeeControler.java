package proy.arq.springrestapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import proy.arq.springrestapi.model.Employee;
import proy.arq.springrestapi.service.EmployeeService;

//@Controller
@RestController // @controller + @ResponseBody

public class EmployeeControler {

	// localhost:8080/api/v1/employees

	@Autowired
	private EmployeeService eService;

/*	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	private String appVersion;

	@GetMapping("/version")
	public String getAppDetalis() {
	return appName+ " - "+ appVersion;
	}

	Muestra lista
	@RequestMapping(value="/employees", method = RequestMethod.GET)
	@ResponseBody */
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return eService.getEmployees();
	}

	// Obtiene informacion
	// localhost:8080/employees/*id*
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) {
		return eService.getSingleEmployee(id);

	}

	// Guarda la informacion
	@PostMapping("/employees")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return eService.saveEmployee(employee) ;
	}

	// Muestra la actualizacion de la informacion
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return eService.updateEmployee(employee);
	}

	// borra informacion
	// localhost:8080/employees?id=34
	@DeleteMapping("/employees")
	public void deleteEmployee(@RequestParam("id") Long id) {
		eService.deleteEmployee(id);
	}

}