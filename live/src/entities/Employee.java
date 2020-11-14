package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void aumento( double porcentangem) {
		this.salary = this.salary * ((porcentangem/100)+1);
		
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
