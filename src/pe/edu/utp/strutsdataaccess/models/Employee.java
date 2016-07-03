package pe.edu.utp.strutsdataaccess.models;

/**
 * Created by GrupoUTP on 02/07/2016.
 */
public class Employee {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
