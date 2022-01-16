public class Swapping_using_operators {
    public static void main(String[] args){
        int a=34;
        int b=45;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The value of a"+a+"The value of b"+b);
    }
}
