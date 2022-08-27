package junit5withoutmockito.dummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DummyTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//assertTrue(true);
		EmployeeRepository employeeRepository=new FakeyEmployeeRepository();
		EmailService emailService=new DummyEmailService();
		EmployeeService service= new EmployeeService(employeeRepository,emailService);
		//service.setEmployeeRepo(employeeRepository);
		
		service.addEmployee(new Employee("Vishal1",1));
		service.addEmployee(new Employee("Vishal2",2));
		assertEquals(2, service.getAllEmployees().size());
		
		service.addEmployee(new Employee("Vishal3",3));
		assertEquals(3, service.getAllEmployees().size());
	}

}
