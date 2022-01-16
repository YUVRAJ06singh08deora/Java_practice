import java.util.Scanner;
public class multiplication_of_float {
    public static void main(String[] args){
        float a1,a2,p;
        Scanner s=new Scanner(System.in);
        a1=s.nextFloat();
        a2=s.nextFloat();
        p=a1*a2;
        System.out.println("The multiplication of floatinf point number is "+p);
        s.close();
    }
}
