import java.util.Scanner;
/*Write a java program to creat a class called employee. create the attributes such as empid, empname and basic pay. create a constructor to initialize the values of the attributes
        declared under the class employee.
        create another constructor to pass the details such as how much the % to be calculated for DA and HRA ( allowances) also give the detection % for PF


        ex. empid, empname, 10000
        DA - 10%, HRA - 4% ( bp*10% + bp*4%) - added to the salary to get the gross pay
        dedections - PF% - 3% (bp*3%) - subtracted from the gross pay
        getting net pay. */

class employee {
    int empid;
    String empname;
    float basic;
    Scanner sc = new Scanner(System.in);

    public void employee() {

        empid = sc.nextInt();
        basic = sc.nextFloat();
        empname = sc.next();
        salary(basic);
    }
    public void salary(float basic_sal){
        float da,hra,bp,pf,netpay,gp;
        da=0.1f*basic_sal;
        hra=0.04f*(basic_sal*0.1f+basic_sal*0.4f);
        gp=da+hra;
        pf=0.03f*(basic_sal*0.03f);
        netpay=gp-pf;
        display(netpay);
    }

    public void display(float total_sal) {

        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + empname);
        System.out.println("Employee salary = " + basic);
        System.out.println("Employee total salary = " + total_sal);
    }
}

public class office {

    public static void main(String[] args) {
        employee e[] = new employee[1];

        for (int i = 0; i < 1; i++) {

            e[i] = new employee();
            e[i].employee();
        }


    }
}