import java.util.Scanner;
class book{
    Scanner s=new Scanner(System.in);
    String bookname,publisher;
    int bookid;
    float price;
    public void book_details(){
        System.out.println("Enter Book name");
        bookname=s.next();
        System.out.println("Enter Book Id");
        bookid=s.nextInt();
        System.out.println("Enter Book Publisher");
        publisher=s.next();
        System.out.println("Enter Book Price");
        price=s.nextFloat();
    }

    public void search_book(String sub_string){
        if(bookname.contains(sub_string)==true){
            System.out.println("Book found and details of the book are");
            System.out.println("Bookname :"+bookname);
            System.out.println("bookid :"+bookid);
            System.out.println("publisher :"+publisher);
            System.out.println("price :"+price);

        }
    }
}
public class book_search {
    public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter no. of objects to be created");
      String sub_string;
      int n=s.nextInt();
      book[] b=new book[n];
      for(int i=0;i<n;i++){
          System.out.println("Enter the details of  "+(i+1)+"  Book");
          b[i]=new book();
         b[i].book_details();

      }
      System.out.println("Enter the some part of name of the book to be searched ");
        sub_string=s.next();
        for(int i=0;i<n;i++){
            b[i].search_book(sub_string);

        }
//
    }
}
