import java.util.*;
public class divisible_by_9 {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%9==0){
            System.out.println("Yes divisible by 9");
        }
        else{
            System.out.println("Not divisible by 9");
        }

    }
}
