package college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{
    
public void teach(){
    System.out.println("I teach Math");
}
public void join() {
    System.out.println("i  joined on 11 Feb");
}
}