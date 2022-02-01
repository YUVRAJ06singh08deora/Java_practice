class person{
int pid=1001;
String pname="Yuvraj";
}
class personeel extends person{
int age=21;
int mobile=123242334;
String address="78 rajput vas";


}
class working extends person{
String location="Rajsthan",desg="Manager";
double salary=92322.1212;

}
public class heirarichal_inheritance {
    public static void main(String[] args) {
       personeel p=new personeel();
       System.out.println("Person id with personnel class"+p.pid);
       working w=new working();
       System.out.println("Person id with working class"+w.pid);
       System.out.println("Name"+p.pname+"age  "+p.age+"Mobile "+p.mobile+" addreess "+p.address+" Location "+w.location+" Salary "+w.salary+" ");

    }
}
