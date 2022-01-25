import java.util.Scanner;
import java.util.*;
public class lower_triangle_sumation {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column for 1st matrix");
        int a = s.nextInt();
        int b = s.nextInt();


        int[][] matrixa = new int[a][b];
        int sum_of_ele=0;
        if(a==b) {
            System.out.println("Enter the values to  first matrix");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    matrixa[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if(i>j){
                        sum_of_ele+=matrixa[i][j];
                    }
                }
            }
            System.out.println("The sum of the lower triangle is "+sum_of_ele);

        }
    }
}
