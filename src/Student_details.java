import java.util.*;
public class Student_details {
    public static void main(String args[]){
        String name="Yuvraj";
        float cgpa= 3.5F;
        String course="Eng";
        int age=21;
        int s1,s2,s3,s4,s5;
        int total;
        int percentage;
        Scanner s=new Scanner(System.in);
        s1=s.nextInt();
        s2=s.nextInt();
        s3=s.nextInt();
        s4=s.nextInt();
        s5=s.nextInt();
        total=s1+s2+s3+s4+s5;
        percentage=(total/500)*100;
        if(percentage>=90 && percentage<100){
            System.out.println("s");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("A");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("b");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("c");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("d");
        }
        else if(percentage<50){
            System.out.println("E");
        }
        else
        {
            System.out.println("Give proper input");
        }


    }
}
