// Single Inheritance
class book23{
    int book_id=101;
    String category="Computer science",book_name="Merko ni pata";
    float price=101.43f;
    void display(){
        System.out.println("Bookid"+book_id+"Book Tiltle"+book_name+"Price"+price);
    }
}
class child_book extends book23{
    child_book(){
   System.out.println("Category  "+category);
    }
}
public class inheritance {
    public static void main(String[] args) {
       child_book c=new child_book();
       c.display();
    }
}
