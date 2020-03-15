package employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
private static ApplicationContext context;

public static void main(final String[] args) {
	context = new ClassPathXmlApplicationContext("Base.xml");
	final Employee e = context.getBean("Emp", Employee.class);
	System.out.println(e.getName()+ e.getId()+ e.getGender());
	
}
}
