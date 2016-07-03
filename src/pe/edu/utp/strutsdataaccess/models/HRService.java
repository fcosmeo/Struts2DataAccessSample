package pe.edu.utp.strutsdataaccess.models;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class HRService {
    private Connection connection;
    private static String DEFAULT_DATA_SOURCE="jdbc/MySQLDataSource";

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public HRService(){
        try {
            InitialContext context=new InitialContext();
            DataSource dataSource=(DataSource) context.lookup(DEFAULT_DATA_SOURCE);
            connection=dataSource.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
            connection=null;
        }

    }

    public List<Employee> findAllEmployees(){
        try {
            EmployeesEntity employeesEntity=new EmployeesEntity();
            employeesEntity.setConnection(getConnection());
            return employeesEntity.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
