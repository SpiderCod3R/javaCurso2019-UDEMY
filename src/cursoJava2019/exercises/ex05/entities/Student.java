package cursoJava2019.exercises.ex05.entities;

public class Student extends Person {
	
	private Course course;
	
	public Student() {

	}

	public Student(String name, String email, Course course) {
		this.name= name;
		this.email=email;
		this.course = course;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String toString() {
		return this.name + ", " + this.email;
	}

}
