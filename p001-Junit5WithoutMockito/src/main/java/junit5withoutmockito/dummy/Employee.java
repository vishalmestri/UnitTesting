package junit5withoutmockito.dummy;

public class Employee {
	
	private String name;
	public Employee() {
		super();
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	

}
