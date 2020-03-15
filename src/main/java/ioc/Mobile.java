package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Sim.xml");
	System.out.println("config loaded");
	Sim j = (Jio) context.getBean("jio");
	Sim a= (Airtel) context.getBean("airtel");
	j.call();
	j.data();
	a.call();
	a.data();
}
}
