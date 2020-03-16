package college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
public void teach(){
    System.out.println("I teach Science");
}
public void join() {
    System.out.println("i  joined on 11 january");
}
}