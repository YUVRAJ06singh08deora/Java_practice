import java.util.Scanner;

class sales_person{
    int p1,p2,p3,total;
    Scanner s=new Scanner(System.in);
    void get_product_no(){
        System.out.println("Enter the quantity of product sold");
      p1=s.nextInt();
      p2=s.nextInt();
      p3=s.nextInt();
      total=p1+p2+p3;
      System.out.println("the total product sold"+total);
    }
}
public class passing_array_As_Arguement {
    public static void main(String[] arr){


    }
}
