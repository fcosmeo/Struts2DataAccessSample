package pe.edu.utp.strutsdataaccess.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeesEntity {
    private Connection connection;
    private static String DEFAULT_QUERY="SELECT * FROM employees";

    public Connection getConnection() { return connection;  }

    public void setConnection(Connection connection) { this.connection = connection; }

    public List<Employee> findAll(){
        String query=DEFAULT_QUERY;
        List<Employee> employees = new ArrayList<>();
        if(getConnection()==null) return null;
        try {
            Statement stmt=getConnection().createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs==null) return null;
            while(rs.next()){
                Employee employee=new Employee(rs.getString("first_name"),rs.getString("last_name"));
                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getEmployeesCount(){ return findAll().size(); }
}
