package cursoJava2019.exercises.ex02.entities;

public class Holder {
	private String name;
	private String email;
	private String phoneNumber;
	private String cpf;
	
	public Holder() {

	}

	public Holder(String name, String email, String phoneNumber, String cpf) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.cpf = cpf;
	}

	public Holder(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Owner Account Data => [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", cpf="
				+ cpf + "]";
	}
}
