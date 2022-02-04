import java.util.Scanner;
class company{
    Scanner s=new Scanner(System.in);
    String department;
    float total_salary;
    float calculate_salary(float base_pay){
        total_salary =base_pay*100;
        return total_salary;
    }

}
class emplyoyee extends company{
    int eid;
    float base_pay;
    float total_salary;
    String department;
    void get_details(){
        eid=s.nextInt();
        base_pay=s.nextFloat();
        department=s.next();
        total_salary=calculate_salary(base_pay);
    }
    void show_details()
        {
        System.out.println(eid);
        System.out.println(base_pay);
        System.out.println(department);
        System.out.println(total_salary);
        }

}
public class lab_4_feb {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        emplyoyee e=new emplyoyee();
        e.get_details();
        e.show_details();

    }
}
