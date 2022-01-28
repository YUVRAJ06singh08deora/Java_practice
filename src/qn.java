import java.util.*;

class book_clas

{

    Scanner sc=new Scanner(System.in);

    int book_id,price;

    String book_name;


   public void get_details()

    {

        System.out.print("Enter Book_id.: ");

        book_id=sc.nextInt();

        System.out.print("Enter Book Name: ");

        book_name=sc.next();

        System.out.print("Enter Price: ");

        price=sc.nextInt();

    }


}

public class qn {
    public static void main(String[] arg){
    int n;
    Scanner in=new Scanner(System.in);
    n= in.nextInt();
        book_clas s[]=new book_clas[n];

        for(int i=0;i<n;i++) {

        s[i] = new book_clas();
        s[i].get_details();

    }
int max=s[0].price;
        for(int i=0;i<n;i++) {
            if(s[i].price>max)
                max=s[i].price;


        }
        System.out.println(max);
}
}