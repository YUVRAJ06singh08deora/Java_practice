import java.util.Scanner;

public class multiplication_matrix {
    public static void main(String args[]) {
        int r1, r2, c1, c2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix1");
        r1 = in.nextInt();

        System.out.println("Enter the number columns of matrix 1");
        c1 = in.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        r2 = in.nextInt();

        System.out.println("Enter the number of columns of matrix 2");
        c2 = in.nextInt();

        if (c1 == r2) {
            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int mul[][] = new int[r1][c2];

            System.out.println("Enter the elements of matrix1");

            for (int i= 0 ; i < r1 ; i++ )
            {

                for (int j= 0 ; j < c1 ;j++ )
                    mat1[i][j] = in.nextInt();

            }
            System.out.println("Enter the elements of matrix2");

            for (int i= 0 ; i < r2 ; i++ )
            {

                for (int j= 0 ; j < c2 ;j++ )
                    mat2[i][j] = in.nextInt();

            }
            System.out.println("\n\noutput matrix:-");
            for (int i= 0 ; i < r1 ; i++ )

                for (int j= 0 ; j <c2;j++)
                {
                    int sum=0;
                    for (int k= 0 ; k <r2;k++ )
                    {
                        sum +=mat1[i][k]*mat2[k][j] ;

                    }
                    mul[i][j]=sum;
                }
            for (int i= 0 ; i < r1; i++ )
            {
                for (int j=0 ; j < c2;j++ )
                    System.out.print(mul[i][j]+" ");

                System.out.println();
            }
        }
        else
            System.out.print("multipication does not exist ");
    }
}