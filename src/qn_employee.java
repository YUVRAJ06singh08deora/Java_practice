import java.util.Scanner;
public class qn_employee {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        String name=s.next();
        int id=s.nextInt();
        int salary = s.nextInt();
        String performance=s.next();
        HR hr = new HR(name, id);
        hr.commanEmpDetails();
        hr.confidentialDetails(salary, performance);

    }
}
abstract class EmployeeDetails { // abstract class are defined using the abstract keyword
    abstract void commanEmpDetails(); // first abstract defination
    abstract void confidentialDetails(int salary, String performance); // second abstract defination with paramaters
    // because they have to be overridden
}
class HR extends EmployeeDetails { // Extends keyword is used for inheritance and to implement the abstract methods
    // of EmployeeDetails class
    private String name;
    private int E_ID;
    private String performance;
    private int salary;
    public HR(String name, int ID) { // this is constructor which will set the comman values
        this.name = name;
        E_ID = ID;
    }
    void commanEmpDetails() { // first abstract method is defined here
        System.out.println("Name: " + this.name);
        System.out.println("E_ID: " + this.E_ID);
    }
    void confidentialDetails(int salary, String performance) { // second abstract method is defined here
        this.salary = salary;
        this.performance = performance;
        System.out.println("Salary: $" + this.salary);
        System.out.println("Performance: " + this.performance);
    }
}
