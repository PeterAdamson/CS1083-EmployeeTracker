//Author Peter Adamson

public class Employee{

	private String name;
	private double salary;

	public Employee(){
	}

	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public double getSalary(){
		return salary;
	}

	public String getName(){
		return name;
	}
}
