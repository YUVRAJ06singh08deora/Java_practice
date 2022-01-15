
import java.io.*;

import java.util.*;

class Student1

{

    Scanner sc=new Scanner(System.in);

    int RegNo,Total=0,subjects;

    String name;

    int marks[];

    Student1()

    {

        System.out.print("Enter Registration No.: ");

        RegNo=sc.nextInt();

        System.out.print("Enter Student Name: ");

        name=sc.next();;

        getDisMarks();

    }

    public void getDisMarks()

    {

        marks=new int[5];

        System.out.print("Enter marks of Physics: ");

        marks[0]=sc.nextInt();

        System.out.print("Enter marks of Chemistry: ");

        marks[1]=sc.nextInt();

        System.out.print("Enter marks of Maths: ");

        marks[2]=sc.nextInt();
        System.out.print("Enter marks of Biology: ");

        marks[3]=sc.nextInt();
        System.out.print("Enter marks of Physical Eductaion: ");

        marks[3]=sc.nextInt();
        System.out.print("Enter marks of Hindi: ");

        marks[4]=sc.nextInt();


        for(int i=0;i<5;i++) {

            Total += marks[i];
        }
        System.out.println("Total Marks of student "+name+": " +Total);


    }
}

class question6

{

    public static void main(String args[])

    {
        int n;
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        Student1 s[]=new Student1[n];
        int grandtotal = 0;

        for(int i=0;i<n;i++) {

            s[i] = new Student1();
            grandtotal+=s[i].Total;

        }
        System.out.println("The class average of whole class is  :"+(grandtotal/n));


    }

}