package cursoJava2019.exercises.ex06.entities;

import cursoJava2019.exercises.ex05.entities.Person;

public class Employee extends Person {

	private Integer id;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double increaseSalary(Double percentage) {
		this.salary += ( this.salary / percentage );
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee id= " + id + ", salary= " + salary + ", Name= " + getName() + "\n";
	}
	
	

}
