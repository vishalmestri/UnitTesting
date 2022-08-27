package junit5withoutmockito.stub;

import java.util.Collection;
import java.util.List;

public class EmployeeService {
	
	private EmployeeRepository employeeRepo;
	public EmployeeService(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	//	this.emailService = emailService;
	}

	//private EmailService emailService;
	
	public Collection<Employee> findEmployeeWithSalaryAfterApprisal(int percentage,int days){
		
		Collection<Employee> coll=employeeRepo.getNewEmployees(days);
		
		for(Employee e:coll) {
			
			
			float f=((float)(100+(float)percentage)/(float)100);
			e.setSalary(e.getSalary()*f);
			System.out.println(e.getId()+"-after-"+e.getSalary());
		}
		
		return coll;
	}
}
