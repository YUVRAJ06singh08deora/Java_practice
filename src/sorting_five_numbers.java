import java.util.Scanner;
public class sorting_five_numbers {
    public static void main(String[] args){
        int[] a=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        for(int j=0;j<5;j++){
            for(int k=j+1;k<5;k++){
                if(a[j]>a[k]){
                    //Swapping the bigger element
                    int temp=0;
                    temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }



            }
            System.out.println(a[j]+" ");
        }
    }
}
