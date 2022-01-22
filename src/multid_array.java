import java.util.Scanner;
public class multid_array {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column for 1st matrix");
        int a = s.nextInt();
        int b = s.nextInt();
        int e[][] = new int[a][b];
        System.out.println("Enter row and column for 1st matrix");
        int c = s.nextInt();
        int d = s.nextInt();
        int[][] matrixa = new int[a][b];
        int[][] matrixb = new int[c][d];
        if (a == c && b == d) {
            System.out.println("Enter the values to  first matrix");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    matrixa[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter the values to  second matrix");
            for (int k = 0; k < c; k++) {
                for (int l = 0; l < d; l++) {
                    matrixa[k][l] = s.nextInt();
                }
            }


        System.out.println("The sum of both matrix is");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                e[i][j] = matrixa[i][j] + matrixb[i][j];
                System.out.print(e[i][j] + "\t");
            }
            System.out.println();
        }
    }
        else{
            System.out.println("ENter proper matrix");
        }
    }
}
