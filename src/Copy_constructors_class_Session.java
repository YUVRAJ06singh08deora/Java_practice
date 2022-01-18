class library
{
    int libno;

    String bookname;

    float price;

    library(int a,String b,float c) // parameterized constructor
    {
        libno=a;

        bookname=b;

        price=c;
    }
    library(library li){
        libno=li.libno;

        bookname=li.bookname;

        price=li.price;
    }
}
public class Copy_constructors_class_Session
{
    public static void main(String a[])
    {

        library l= new library(1002, "C program", 100.34f);
        library lib=new library(l);

        System.out.println(lib.libno+""+ lib.bookname+" "+lib.price);
    }
}