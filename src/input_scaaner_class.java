import java.util.Scanner;
public class input_scaaner_class {
public static void main(String[] arg){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int a =s.nextInt();
    float b=s.nextFloat();
    System.out.println("String :"+str+"   Integer : "+a+"  Float :"+b);
    s.close();
}
}
