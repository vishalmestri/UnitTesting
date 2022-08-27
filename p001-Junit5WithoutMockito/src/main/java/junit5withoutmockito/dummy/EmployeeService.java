package junit5withoutmockito.dummy;

import java.util.Collection;
import java.util.List;

public class EmployeeService {
	
	private EmployeeRepository employeeRepo;
	public EmployeeService(EmployeeRepository employeeRepo, EmailService emailService) {
		super();
		this.employeeRepo = employeeRepo;
		this.emailService = emailService;
	}

	private EmailService emailService;
	
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
