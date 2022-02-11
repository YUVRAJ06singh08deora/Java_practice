import java.util.Scanner;
abstract class bill {
    Scanner s=new Scanner(System.in);
    abstract float clothing(int item);
}

// Class 2
 class redeem extends bill {
    float[] price=new float[100];
    float total_amt;
    String[] item_name=new String[100];

    float clothing(int item){

        for(int i=0;i<item;i++){
            System.out.println("product"+(i+1)+"Details");
            item_name[i]=s.next();
            System.out.println("product"+(i+1)+"price");
            price[i]=s.nextInt();
            total_amt+=price[i];
        }
        System.out.println("***********************************************");
        for(int i=0;i<item;i++){
            System.out.println("Item Name  "+item_name[i]+"price    "+price[i]);
        }
        return total_amt;
    }
}
 class tax extends redeem {
    float cgst,sgst,total_tax,final_amt;
    void clac_tax(float total_amt)
    {

        cgst=0.05f*total_amt;
        sgst=0.05f*total_amt;
        total_tax=cgst+sgst;
        final_amt=total_amt+total_tax;

    }
    void show_tax(){

        System.out.println("Central GST : "+cgst+" State GST : "+sgst);
        System.out.println("Total Amount to be paid  : "+final_amt);
    }

}

// Class 3
// Main class

public class krina_qn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int item;
        float total_amt;
        System.out.println("Enter no. of items");
        item= s.nextInt();
        bill b=new redeem();
        total_amt = b.clothing(item);

        tax t=new tax();

        t.clac_tax(total_amt);
        t.show_tax();

    }
}
