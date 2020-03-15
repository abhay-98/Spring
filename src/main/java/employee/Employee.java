package employee;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	private String name;
	private int id;
	private String gender;
	

	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Value("${employee.id}")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGender() {
		return gender;
	}
	@Value("${employee.gender}")
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
