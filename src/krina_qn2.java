import java.util.*;
abstract class Order {abstract void doublePizza(int se, int bev);}
class Offer extends Order
{
    int price; float subTotal;
    void doublePizza(int se, int bev)
    {
        if (se == 1)
        {
            price = 50;
        }
        else if (se == 2)
        {
            price = 100;
        }
        else if (se == 3)
        {
            price = 150;
        }
        subTotal = (float)(price + (bev * 45));
        System.out.println("Subtotal: " + subTotal);
    }
}
class tax1 extends Offer
{
    float taxx, gt;
    void amtPizza()
    {
        taxx = (float)subTotal * 0.23f;
        System.out.println("Tax: " + taxx);
        gt = (float)subTotal + taxx;
        System.out.println("Grand Total = " + gt);
    }
}
public class krina_qn2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pizza size:(1,2,3): ");
        int se = sc.nextInt();
        System.out.print("Enter the no of bevrages: ");
        int bev = sc.nextInt();
        tax1 t = new tax1();
        t.doublePizza(se, bev);
        t.amtPizza();
        sc.close();
    }
}