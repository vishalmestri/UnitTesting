package junit5withoutmockito.dummy;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository {

	public Employee add(Employee e);
	public Employee get(int id);
	public Collection<Employee> getAll();
}
