package college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class College{
    @Autowired
private bean neab;

@Autowired
private Teacher MathTeacher;

@Value("${college.name}")
private String name;

@Value("${college.U_Roll}")
private String U_Roll;


public void display(){
    neab.jit();
    MathTeacher.join();
    MathTeacher.teach();
}
}