package junit5withoutmockito.stub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

class StubTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//assertTrue(true);
		EmployeeRepository employeeRepository=new StubEmployeeRepository();
		EmployeeService service= new EmployeeService(employeeRepository);
		int percentage=10;
		
		Collection<Employee> list=service.findEmployeeWithSalaryAfterApprisal(percentage, 3);
		assertEquals(3, list.size());
		
		List<Employee> l=(List)list;
		assertEquals(1100000.0, l.get(0).getSalary());
		assertEquals(2200000.0, l.get(1).getSalary());
		assertEquals(3300000.0, l.get(2).getSalary());
	}

}
