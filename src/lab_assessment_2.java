import java.util.Scanner;
abstract class bill1 {
    Scanner s=new Scanner(System.in);
    abstract float clothing(int item);
}

// Class 2
class redeem1 extends bill1 {
    float[] price=new float[100];
    float total_amt;
    float reddem_amt;
    String[] item_name=new String[100];

    float clothing(int item){

        for(int i=0;i<item;i++){
            System.out.println("Product"+(i+1)+" Details");
            item_name[i]=s.next();
            System.out.println("Product"+(i+1)+" Price");
            price[i]=s.nextInt();
            total_amt+=price[i];

        }
        System.out.println("Enter the amount to be redeemed");
        reddem_amt=s.nextFloat();
        total_amt=total_amt-reddem_amt;
        System.out.println("***********************************************");
        System.out.println("Itme Name              Price");
        for(int i=0;i<item;i++){
            System.out.println(item_name[i]+"                  "+price[i]);
        }
        System.out.println("Total amount redeemed "+reddem_amt);
        return total_amt;
    }
}
class tax12 extends redeem1 {
    float cgst,sgst,total_tax,final_amt;
    void clac_tax(float total_amt)
    {

        cgst=0.0525f*total_amt;
        sgst=0.0525f*total_amt;
        total_tax=cgst+sgst;
        final_amt=total_amt+total_tax;

    }
    void show_tax(){

        System.out.println("Central GST : "+cgst);
        System.out.println("State GST   :"+sgst);
        System.out.println("Total Amount to be paid  : "+final_amt);
    }

}



public class lab_assessment_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int item;
        float total_amt;
        System.out.println("Enter no. of items");
        item= s.nextInt();
        bill1 b=new redeem1();
        total_amt = b.clothing(item);

        tax12 t=new tax12();

        t.clac_tax(total_amt);
        t.show_tax();

    }
}
