package pe.edu.utp.strutsdataaccess.actions;

import pe.edu.utp.strutsdataaccess.models.Employee;
import pe.edu.utp.strutsdataaccess.models.HRService;

import java.util.List;

/**
 * Created by GrupoUTP on 02/07/2016.
 */
public class ListEmployeesAction {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String execute(){
        HRService service=new HRService();
        if(service==null) return "error";
        employees=service.findAllEmployees();
        if(employees==null) return "error";
        return "success";
    }
}
