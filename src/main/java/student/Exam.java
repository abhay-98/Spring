package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext stu=new ClassPathXmlApplicationContext("depen.xml");
Student s= stu.getBean("name", Student.class);
System.out.println(s.getName());
s.cheat();

}
}
