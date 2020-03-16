package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("${employee.name}")
	private String name;

	@Value("${employee.id}")
	private int id;

	@Value("${employee.gender}")
	private String gender;

	@Autowired
	private Salaray salaray;

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getGender() {
		return gender;
	}

	public void getSalaray() {
		 salaray.moneyAllotted();
	}
}
