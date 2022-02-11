import java.util.Scanner;
interface polygon{
    void dimensions();
    interface type{
        void shape();
    }
}
class rectangle implements polygon,polygon.type{
    Scanner s=new Scanner(System.in);
    int length,breadth;
    public void dimensions(){
        System.out.println("Enter the length of rectangle");
        length=s.nextInt();
        System.out.println("Enter the Breadth of rectangle");
        breadth=s.nextInt();
        if(length==breadth){
            System.out.println("It is square not rectangle");
            System.out.println("The Area of Square is"+area(length,breadth));
        }
        else {
            System.out.println("This is rectangle");
            System.out.println("The Area of Rectangle is"+area(length,breadth));
        }
    }
    public int area(int length,int breadth){
        int area = length*breadth;
        return area;
    }
    public void shape()
    {
        System.out.println("Hello shape called ");
    }
}
class square implements polygon,polygon.type{
    Scanner s=new Scanner(System.in);
    int length;
    public void dimensions(){
        System.out.println("Enter the length of rectangle");
        length=s.nextInt();
            System.out.println("The Area of Square is"+area(length));
    }
    public int area(int length){
        int area = length*length;
        return area;
    }
    public void shape()
    {
        System.out.println("Hello shape called ");
    }
}
public class nested_interface {
    public static void main(String[] args) {
        polygon area=new rectangle();
        area.dimensions();


        }
    }
