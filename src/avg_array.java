import java.util.*;
public class avg_array {

        public static void main(String ar[])
        {
            int total = 0;
            int a[]=new int[10];//decclaring an array
            System.out.println("Enter the values of the array");

            Scanner s = new Scanner(System.in);

            for(int i=0;i<10;i++)
            {
                a[i]=s.nextInt();
                total+=a[i];
            }
            System.out.println("the values are ");
            for(int i=0;i<10;i++)
            {
                System.out.println(a[i]);

            }
            System.out.println("the average is "+total/10);


        }

    }

