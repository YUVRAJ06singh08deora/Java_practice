import java.util.Scanner;
public class searching_ele_in_array {
    public static void main(String[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column for 1st matrix");
        int a = s.nextInt();
        int b = s.nextInt();


        int[][] matrixa = new int[a][b];


            System.out.println("Enter the values to  first matrix");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    matrixa[i][j] = s.nextInt();
                }
            }
            System.out.println("Eneter the element to be searched");
        int ele=s.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (matrixa[i][j]==ele) {
                        System.out.println("ELement found  "+ele);
                        System.out.println("Position of element in matrix is  row:  "+(i+1)+"Coulmn  "+(j+1));
                    }
                    else{
                        System.out.println("element not found");
                    }
                }
            }



    }
}