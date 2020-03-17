package beanLifeCycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    private static ApplicationContext context;

    public static void main(String[] args) throws SQLException {
      context = new AnnotationConfigApplicationContext(data.class);
      StudentDao sao= context.getBean("StudentDao", StudentDao.class);
      sao.selectAllRows();
    }
}