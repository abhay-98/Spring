package beanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class StudentDao {

    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost/testdb")
    private String url;
    @Value("root")
    private String userName;
    @Value("root")
    private String password;

    public Statement stmt;

    @PostConstruct
    public void createConnection() throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, userName, password);

         stmt = con.createStatement();
    }


    public void selectAllRows() throws SQLException {

        ResultSet rs= stmt.executeQuery("SELECT * FROM testdb.student;");

        while (rs.next()) {
            int PersonID= rs.getInt(1);
            String LastName= rs.getString(2);
            String FirstName= rs.getString(3);
            String Address= rs.getString(4);
            String City= rs.getString(5);
            
            System.out.println(PersonID + " "+ FirstName +" " + LastName +" "+ Address + " " + City);
        }
    }
}