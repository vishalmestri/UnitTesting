package junit5withoutmockito.stub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StubEmployeeRepository implements EmployeeRepository {

	@Override
	public Collection<Employee> getNewEmployees(int days) {
		// TODO Auto-generated method stub
		
		Collection<Employee> coll=new ArrayList<>();
		coll.add(new Employee("Vishal1",1,1000000));
		coll.add(new Employee("Vishal2",2,2000000));
		coll.add(new Employee("Vishal3",3,3000000));
		return coll;
	}

	

}
