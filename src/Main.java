//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Person person = new Person();
        //person.sayHello();

        //create department
        Department department = new Department("Marketing");

        //creating employees
        Employment employee1 = new Employment("Alice ", 101, 5000);
        Employment employee2 = new Employment("samuel ", 102, 65000);
        Employment employee3 = new Employment("Rorisang ", 103, 350);

        //add employees to the department
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        //display all employees in the department
        department.displayAllEmployees();

        //calculate and display total salary of all employees in the department

        double totalSalary = department.calculateTotalSalary();
        System.out.println("Total salary of all employees on " + department.getDepartmentName() + "Department: $" + totalSalary);

    }
}
//laughing out lout I think this is really cool honestly