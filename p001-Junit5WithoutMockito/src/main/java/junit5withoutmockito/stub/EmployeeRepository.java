package junit5withoutmockito.stub;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository {

	Collection<Employee> getNewEmployees(int days);

}
