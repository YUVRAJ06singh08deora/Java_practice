import java.util.*;
public class q6WithOutClass {
public static void main(String args[]){
    int n;
    System.out.println("Enter the number of students");
    Scanner s=new Scanner(System.in);
    n = s.nextInt();
    int[] arrStudent;
    arrStudent = new int[n];
    int[] marks;
    marks = new int[n];
    int grandTotal=0;
     for (int i=0;i<n;i++){
         System.out.println("Enter student");
         System.out.println((i+1));
         System.out.println("Marks");
         marks[i] = s.nextInt();
         grandTotal+=marks[i];
     }
     System.out.println(grandTotal);

}
}
