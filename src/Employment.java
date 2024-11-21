public class Employment {

    private final String name;
    private final int id;
    private final double salary;

    //constructor to initialize employee objects
    public Employment(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //getters for employee datails
    public String getName(){
        return  name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    //method to display employee details

    public void displayEmployeeDetails(){
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
