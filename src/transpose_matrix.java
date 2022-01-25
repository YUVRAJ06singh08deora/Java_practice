import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column for 1st matrix");
        int a = s.nextInt();
        int b = s.nextInt();
        int c;

        int[][] matrixa = new int[a][b];


        System.out.println("Enter the values to   matrix");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrixa[i][j] = s.nextInt();
            }
        }
        System.out.println("The transposed matrix");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrixa[j][i]+" ");
            }
            System.out.println();
        }



    }
}
