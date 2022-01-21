public class overloading_method {
    int overload(int num1, int num2)
    {
        return num1+num2;
    }
    double overload(double num1, double num2)
    {
        return num1*num2;
    }
    public static void main(String[] args){
        overloading_method obj = new overloading_method();
        int a = obj.overload(10, 15);
        System.out.println("Sum :"+a);
        double b=obj.overload(10.5,11.6);
        System.out.println("Multiplication of double: "+b);
    }
}
