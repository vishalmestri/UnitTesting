package junit5withoutmockito.dummy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeyEmployeeRepository implements EmployeeRepository {

	private Map<Integer,Employee> map=new HashMap<Integer,Employee>();
	
	@Override
	public Employee add(Employee e) {
		// TODO Auto-generated method stub
		map.put(e.getId(), e);
		return null;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public Collection<Employee> getAll() {
		// TODO Auto-generated method stub
		return map.values();
	}

}
