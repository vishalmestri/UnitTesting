package junit5withoutmockito.fake;

import java.util.Collection;
import java.util.List;

public class EmployeeService {
	
	private EmployeeRepository employeeRepo;
	
	public EmployeeRepository getEmployeeRepo() {
		return employeeRepo;
	}

	public void setEmployeeRepo(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public void addEmployee(Employee e) {
		 employeeRepo.add(e);
	}
	
	public Employee getEmployee(int empId) {
		return employeeRepo.get(empId);
	}
	
	public Collection<Employee> getAllEmployees(){
		return employeeRepo.getAll();
	}

}
