import java.util.ArrayList;

//this class manages a list of employees and can calculate the total salary
//of all employees in the department
public class Department {
    private final String departmentName;
    private final ArrayList<Employment> employees;

    //getting a constructor to initialize department
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    //getting the department Name
    public  String getDepartmentName(){
        return departmentName;
    }
    //method to add an employee to the department
    public void addEmployee(Employment employee){
        employees.add(employee);
    }

    //method to calculate the total salary
    public double calculateTotalSalary(){
        double totalSalary = 0D;
        for(Employment employee : employees){
            totalSalary += employee.getSalary();
        }
        return  totalSalary;
    }

    //method to display all the employees in the department
    public void displayAllEmployees(){
        System.out.println("Employees in the " + departmentName + "Department");

        for(Employment employee : employees){
            employee.displayEmployeeDetails();
            System.out.println();
        }
    }
}
