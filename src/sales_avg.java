import java.util.Scanner;
class products{
    Scanner s=new Scanner(System.in);
    int p1,p2,p3,total;
    public int getProductDetails(){
        System.out.println("Enter the number of Product 1 sold");
        p1=s.nextInt();
        System.out.println("Enter the number of Product 2 sold");
        p2=s.nextInt();
        System.out.println("Enter the number of Product 3 sold");
        p3=s.nextInt();
        total=p1+p2+p3;
        return total;
    }
}
public class sales_avg {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Eneter the no. of sales person");
        int nos=s.nextInt();
        int[] total_product=new int[nos];
        products[] p=new products[nos];
//        System.out.println();
        for(int i=0;i<nos;i++){
            System.out.println("Eneter the sales details for Sales person"+(i+1));
            p[i]=new products();
            total_product[i]=p[i].getProductDetails();
        }
        int p_max=0;
        int index=0;
        for(int i=0;i<nos;i++){
            if(p_max<total_product[i]){
                p_max=total_product[i];
                index=i+1;
            }
        }
        System.out.println("The greater no. of sales is for the sales person is  "+p_max+"  for the sales person no."+index);

    }
}
