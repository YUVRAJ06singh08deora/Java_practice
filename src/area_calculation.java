import java.util.*;
class area{
    int area;
    area(int l,int b){
     area=l*b;
     System.out.println("The area is"+area);
    }
    area(int a){
        System.out.println("The area of square is "+(a*a));
    }
}
public class area_calculation {
    public static void main(String[] arg){
     Scanner s=new Scanner(System.in);
     int length,breadth,side;
     length=s.nextInt();
     breadth=s.nextInt();
     area a1=new area(length,breadth);
     System.out.println("ENter the value of side for square");
     side=s.nextInt();
     area a2=new area(side);
    }
}
