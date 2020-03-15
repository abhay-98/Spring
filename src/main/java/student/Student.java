package student;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int roll;
	 private String name;
	 private ob object;
	 
	 
	public void cheat() {
		object.out();
	}
	@Autowired
	public void setObject(ob object) {
		this.object = object;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

		
}
