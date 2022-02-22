package entities;

public class _14_aluguel {
	
	private String name;
	private String email;
	
	public _14_aluguel(String name, String email) {
		this.name = name;
		this.email = email;
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
	
	public String toString() {
		return name + ", " + email;
	}
}
