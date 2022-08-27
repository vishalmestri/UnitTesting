package junit5withoutmockito.stub;

public class Employee {
	
	
	private float salary;
	private String name;
	public Employee() {
		super();
	}
	public Employee(String name, int id,int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary=salary;
	}
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
