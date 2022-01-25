import java.util.Scanner;
import java.util.*;
public class unit_matrix {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column for 1st matrix");
        int a = s.nextInt();
        int b = s.nextInt();
        boolean flag=true;

        int[][] matrixa = new int[a][b];
        if(a==b) {
        System.out.println("Enter the values to  first matrix");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrixa[i][j] = s.nextInt();
            }
        }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == j && matrixa[i][j] != 1) {
                        flag = false;
                        break;
                    }
                    if (i != j && matrixa[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }

            }
            if (flag) {
                System.out.println("unit matrix");
            } else {
                System.out.println("Non unit matrix");
            }
        }
        else{
            System.out.println("Enter proper nXn matrix");
        }
    }
}
